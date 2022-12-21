public sailpoint.object.Identity changeIdentityPassword(java.util.Map<java.lang.String, java.lang.String> accountsToChangePass) {
    java.lang.String newPassword = accountsToChangePass.remove("Identity");
    System.out.println("log");
    identity.setPassword(newPassword);
    return identity;
}
