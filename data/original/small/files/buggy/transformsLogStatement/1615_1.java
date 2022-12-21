public void setParentAuthor(eu.bittrade.libs.steemj.base.models.AccountName parentAuthor) {
    System.out.println("log");
    this.parentAuthor = parentAuthor;
    addRequiredPrivateKeyType(parentAuthor, PrivateKeyType.POSTING);
}
