public void credentialsProvider() {
    java.lang.String IDENTITY_POOL = "";
    com.amazonaws.auth.CognitoCachingCredentialsProvider credentialsProvider = new com.amazonaws.auth.CognitoCachingCredentialsProvider(getApplicationContext(), IDENTITY_POOL, com.amazonaws.regions.Regions.AP_NORTHEAST_2);
    try {
        setAmazonClient(credentialsProvider);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
