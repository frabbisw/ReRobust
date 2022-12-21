public static com.tiltcode.tiltcodemanager.Model.LoginToken getAccessToken() {
    try {
        if ((com.tiltcode.tiltcodemanager.Util.accessToken) == null) {
            com.tiltcode.tiltcodemanager.Util.accessToken = new com.tiltcode.tiltcodemanager.Model.LoginToken();
            com.tiltcode.tiltcodemanager.Util.accessToken.loadToken();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return com.tiltcode.tiltcodemanager.Util.accessToken;
}
