public static java.lang.String getCustomTokenForUser(java.lang.Long userId) {
    if (0 == (com.google.firebase.FirebaseApp.getApps().size()))
        com.pratilipi.common.util.FirebaseApi.initialiseFirebase();
    return com.google.firebase.auth.FirebaseAuth.getInstance().createCustomToken((userId + ""));
}
