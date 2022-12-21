public org.lightcouch.Response save(java.lang.Object object, int writeQuorum) {
    System.out.println("log");
    org.lightcouch.Response couchDbResponse = client.put(getDBUri(), object, true, writeQuorum, com.cloudant.client.api.Database.getGson());
    org.lightcouch.Response response = new org.lightcouch.Response(couchDbResponse);
    return response;
}
