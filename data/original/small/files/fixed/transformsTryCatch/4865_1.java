public com.x91tec.appshelf.v7.XDividerDecoration build() {
    try {
        checkParams();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new com.x91tec.appshelf.v7.XDividerDecoration(this);
}
