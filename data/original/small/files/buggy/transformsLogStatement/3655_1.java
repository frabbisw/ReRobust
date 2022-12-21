public org.json.JSONObject getDataWithoutHeader() {
    org.json.JSONObject dataCopy = new org.json.JSONObject(data);
    dataCopy.remove("message");
    System.out.println("log");
    dataCopy.remove("title");
    return dataCopy;
}
