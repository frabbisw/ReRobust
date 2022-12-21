public void setParentAuthor(eu.bittrade.libs.steemj.base.models.AccountName parentAuthor) {
    this.parentAuthor = parentAuthor;
    try {
        addRequiredPrivateKeyType(parentAuthor, PrivateKeyType.POSTING);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
