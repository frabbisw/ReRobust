public void setUsername(java.lang.String username) {
    System.out.println("log");
    if ((max_Char(username, 20)) && ((username.length()) >= 1)) {
        this.username = username;
    } else {
        throw new java.lang.IllegalArgumentException();
    }
}
