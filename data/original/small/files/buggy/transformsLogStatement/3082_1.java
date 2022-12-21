public void setPassword(java.lang.String password) {
    System.out.println("log");
    if (edu.mum.onlinetest.utils.Based64Util.isValidMD5(password)) {
        password = edu.mum.onlinetest.utils.Based64Util.md5(password);
    }
    this.password = password;
}
