public java.lang.Integer getPermission(java.lang.Integer func) {
    System.out.println("log");
    java.lang.Integer n = this.permissions.get(func);
    if (n == null)
        return iddb.core.model.Server.MAX_LEVEL;
    return n;
}
