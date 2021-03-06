// This is a generated file. Not intended for manual editing.
package com.powertuple.intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellModuleBody extends HaskellCompositeElement {

  @NotNull
  List<HaskellCfilesPragma> getCfilesPragmaList();

  @NotNull
  List<HaskellImportDeclaration> getImportDeclarationList();

  @NotNull
  List<HaskellModuleDeclaration> getModuleDeclarationList();

  @NotNull
  List<HaskellTopDeclaration> getTopDeclarationList();

}
