/*
 * Copyright 2015 Rik van der Kleij
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.powertuple.intellij.haskell.view

import com.intellij.openapi.actionSystem.{AnAction, AnActionEvent, CommonDataKeys}
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.util.PsiUtilBase
import com.powertuple.intellij.haskell.external.GhcModiTypeInfo
import com.powertuple.intellij.haskell.psi.HaskellPsiHelper
import com.powertuple.intellij.haskell.util.HaskellEditorUtil

class ShowTypeAction extends AnAction {

  override def update(actionEvent: AnActionEvent) {
    HaskellEditorUtil.enableAndShowIfInHaskellFile(actionEvent)
  }

  def actionPerformed(actionEvent: AnActionEvent) {
    val context = actionEvent.getDataContext
    for {
      editor <- Option(CommonDataKeys.EDITOR.getData(context))
      psiFile <- Option(PsiUtilBase.getPsiFileInEditor(editor, CommonDataKeys.PROJECT.getData(context)))
      offset = editor.getCaretModel.getOffset
      expression <- Option(psiFile.findElementAt(offset).getText)
    } yield {
      val selectionModel = Option(editor.getSelectionModel)
      selectionModel match {
        case Some(sm) if Option(sm.getSelectedText).isDefined => GhcModiTypeInfo.findTypeInfoForSelection(psiFile, sm) match {
          case Some(ti) => HaskellEditorUtil.createInfoBallon(ti.typeSignature, editor)
          case None => HaskellEditorUtil.showHint(editor, "Could not determine type for selection")
        }
        case _ => Option(psiFile.findElementAt(offset)).flatMap(e => HaskellPsiHelper.findHaskellNamedElement(e)).foreach { psiElement =>
          GhcModiTypeInfo.findTypeInfoFor(psiFile, psiElement) match {
            case Some(ti) => HaskellEditorUtil.createInfoBallon(ti.typeSignature, editor)
            case None => HaskellEditorUtil.showHint(editor, s"Could not determine type for ${StringUtil.escapeXml(psiElement.getText)}")
          }
        }
      }
    }
  }

}
