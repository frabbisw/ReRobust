public com.x91tec.appshelf.v7.XDividerDecoration build(android.content.Context context) {
    try {
        checkParams(context);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new com.x91tec.appshelf.v7.XDividerDecoration(this);
}
