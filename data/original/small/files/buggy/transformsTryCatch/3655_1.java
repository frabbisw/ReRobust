public org.json.JSONObject getDataWithoutHeader() {
    org.json.JSONObject dataCopy = new org.json.JSONObject(data);
    dataCopy.remove("message");
    try {
        dataCopy.remove("title");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return dataCopy;
}
