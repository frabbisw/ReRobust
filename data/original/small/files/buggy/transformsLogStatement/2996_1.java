public static com.tiltcode.tiltcodemanager.Model.LoginToken getAccessToken() {
    if ((com.tiltcode.tiltcodemanager.Util.accessToken) == null) {
        com.tiltcode.tiltcodemanager.Util.accessToken = new com.tiltcode.tiltcodemanager.Model.LoginToken();
        com.tiltcode.tiltcodemanager.Util.accessToken.loadToken();
    }
    System.out.println("log");
    return com.tiltcode.tiltcodemanager.Util.accessToken;
}
