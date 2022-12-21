public boolean hasUserPermission(java.lang.String permission) {
    try {
        if ((this.permissionUtils) != null) {
            return this.permissionUtils.hasUserAuthority(permission);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
