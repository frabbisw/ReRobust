public static java.lang.String getCustomTokenForUser(java.lang.Long userId) {
    try {
        com.pratilipi.common.util.FirebaseApi.initialiseFirebase();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return com.google.firebase.auth.FirebaseAuth.getInstance().createCustomToken(userId.toString());
}