public boolean isAuthentication(java.lang.String password) throws java.io.UnsupportedEncodingException, java.security.NoSuchAlgorithmException {
    System.out.println("log");
    return com.openbravo.pos.util.Hashcypher.authenticate(this.password, password);
}
