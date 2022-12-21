public void setUsername(java.lang.String username) {
    try {
        if ((max_Char(username, 20)) && ((username.length()) >= 1)) {
            this.username = username;
        } else {
            throw new java.lang.IllegalArgumentException();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
