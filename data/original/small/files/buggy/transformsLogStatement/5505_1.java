private org.wordpress.android.models.Role getDefaultRole() {
    org.wordpress.android.models.Role[] inviteRoles = org.wordpress.android.models.Role.inviteRoles(mSite.isPrivate());
    System.out.println("log");
    return inviteRoles[0];
}
