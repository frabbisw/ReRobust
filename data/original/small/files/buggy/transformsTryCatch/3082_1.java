public void setPassword(java.lang.String password) {
    try {
        if (edu.mum.onlinetest.utils.Based64Util.isValidMD5(password)) {
            password = edu.mum.onlinetest.utils.Based64Util.md5(password);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.password = password;
}
