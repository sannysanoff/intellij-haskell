// This is a generated file. Not intended for manual editing.
package com.powertuple.intellij.haskell.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.powertuple.intellij.haskell.psi.HaskellTypes.*;
import com.powertuple.intellij.haskell.psi.*;
import com.intellij.navigation.ItemPresentation;
import scala.collection.Seq;

public class HaskellDerivingDeclarationImpl extends HaskellCompositeElementImpl implements HaskellDerivingDeclaration {

  public HaskellDerivingDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) ((HaskellVisitor)visitor).visitDerivingDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HaskellInst getInst() {
    return findNotNullChildByClass(HaskellInst.class);
  }

  @Override
  @NotNull
  public HaskellQcon getQcon() {
    return findNotNullChildByClass(HaskellQcon.class);
  }

  @Override
  @Nullable
  public HaskellScontext getScontext() {
    return findChildByClass(HaskellScontext.class);
  }

  public String getName() {
    return HaskellPsiImplUtil.getName(this);
  }

  public ItemPresentation getPresentation() {
    return HaskellPsiImplUtil.getPresentation(this);
  }

  public Seq<HaskellNamedElement> getIdentifierElements() {
    return HaskellPsiImplUtil.getIdentifierElements(this);
  }

}
