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

public class HaskellTopDeclarationImpl extends HaskellCompositeElementImpl implements HaskellTopDeclaration {

  public HaskellTopDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) ((HaskellVisitor)visitor).visitTopDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HaskellCfilesPragma getCfilesPragma() {
    return findChildByClass(HaskellCfilesPragma.class);
  }

  @Override
  @Nullable
  public HaskellClassDeclaration getClassDeclaration() {
    return findChildByClass(HaskellClassDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellDataDeclaration getDataDeclaration() {
    return findChildByClass(HaskellDataDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellDefaultDeclaration getDefaultDeclaration() {
    return findChildByClass(HaskellDefaultDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellDerivingDeclaration getDerivingDeclaration() {
    return findChildByClass(HaskellDerivingDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellExpression getExpression() {
    return findChildByClass(HaskellExpression.class);
  }

  @Override
  @Nullable
  public HaskellForeignDeclaration getForeignDeclaration() {
    return findChildByClass(HaskellForeignDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellInstanceDeclaration getInstanceDeclaration() {
    return findChildByClass(HaskellInstanceDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellNewtypeDeclaration getNewtypeDeclaration() {
    return findChildByClass(HaskellNewtypeDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellOtherPragma getOtherPragma() {
    return findChildByClass(HaskellOtherPragma.class);
  }

  @Override
  @Nullable
  public HaskellQqExpression getQqExpression() {
    return findChildByClass(HaskellQqExpression.class);
  }

  @Override
  @Nullable
  public HaskellQuasiQuote getQuasiQuote() {
    return findChildByClass(HaskellQuasiQuote.class);
  }

  @Override
  @Nullable
  public HaskellTypeDeclaration getTypeDeclaration() {
    return findChildByClass(HaskellTypeDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellTypeFamilyDeclaration getTypeFamilyDeclaration() {
    return findChildByClass(HaskellTypeFamilyDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellTypeInstanceDeclaration getTypeInstanceDeclaration() {
    return findChildByClass(HaskellTypeInstanceDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellTypeSignatureDeclaration getTypeSignatureDeclaration() {
    return findChildByClass(HaskellTypeSignatureDeclaration.class);
  }

}
