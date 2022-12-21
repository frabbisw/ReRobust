public static com.tiltcode.tiltcodemanager.Model.LoginToken getAccessToken() {
    if (null == (com.tiltcode.tiltcodemanager.Util.accessToken)) {
        com.tiltcode.tiltcodemanager.Util.accessToken = new com.tiltcode.tiltcodemanager.Model.LoginToken();
        com.tiltcode.tiltcodemanager.Util.accessToken.loadToken();
    }
    return com.tiltcode.tiltcodemanager.Util.accessToken;
}
