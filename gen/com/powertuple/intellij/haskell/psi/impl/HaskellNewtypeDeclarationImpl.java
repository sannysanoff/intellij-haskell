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

public class HaskellNewtypeDeclarationImpl extends HaskellCompositeElementImpl implements HaskellNewtypeDeclaration {

  public HaskellNewtypeDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) ((HaskellVisitor)visitor).visitNewtypeDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HaskellContext getContext() {
    return findChildByClass(HaskellContext.class);
  }

  @Override
  @Nullable
  public HaskellCtypePragma getCtypePragma() {
    return findChildByClass(HaskellCtypePragma.class);
  }

  @Override
  @NotNull
  public HaskellNewconstr getNewconstr() {
    return findNotNullChildByClass(HaskellNewconstr.class);
  }

  @Override
  @NotNull
  public HaskellSimpletype getSimpletype() {
    return findNotNullChildByClass(HaskellSimpletype.class);
  }

  @Override
  @Nullable
  public HaskellTtype getTtype() {
    return findChildByClass(HaskellTtype.class);
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

  public HaskellNamedElement getSimpleType() {
    return HaskellPsiImplUtil.getSimpleType(this);
  }

}
