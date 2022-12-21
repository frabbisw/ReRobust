public java.lang.Integer getPermission(java.lang.Integer func) {
    java.lang.Integer n = this.permissions.get(func);
    if (null == n)
        return iddb.core.model.Server.MAX_LEVEL;
    return n;
}
