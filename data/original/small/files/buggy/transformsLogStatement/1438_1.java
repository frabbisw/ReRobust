com.google.gson.JsonElement get(com.launchdarkly.client.LDUser user) {
    System.out.println("log");
    return user.getSecondary();
}
