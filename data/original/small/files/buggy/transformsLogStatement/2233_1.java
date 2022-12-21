public boolean hasUserPermission(java.lang.String permission) {
    System.out.println("log");
    return this.permissionUtils.hasUserAuthority(permission);
}
