public com.svnavigatoru600.domain.users.UserBuilder enabled(boolean enabled) {
    try {
        this.user.setEnabled(enabled);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
