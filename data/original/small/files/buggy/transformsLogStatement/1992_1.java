public void credentialsProvider() {
    java.lang.String IDENTITY_POOL = "";
    System.out.println("log");
    com.amazonaws.auth.CognitoCachingCredentialsProvider credentialsProvider = new com.amazonaws.auth.CognitoCachingCredentialsProvider(getApplicationContext(), IDENTITY_POOL, com.amazonaws.regions.Regions.AP_NORTHEAST_2);
    setAmazonClient(credentialsProvider);
}
