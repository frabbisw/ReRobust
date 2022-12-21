public void setUsername(java.lang.String username) {
    if (((username.length()) >= 1) && (max_Char(username, 20))) {
        this.username = username;
    } else {
        throw new java.lang.IllegalArgumentException();
    }
}
