public void setRoles(java.util.Set<java.lang.String> roles) {
    try {
        this.roles.addAll(roles);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
