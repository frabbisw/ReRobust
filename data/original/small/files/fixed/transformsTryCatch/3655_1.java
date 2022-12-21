public org.json.JSONObject getDataWithoutHeader() {
    org.json.JSONObject dataCopy = new org.json.JSONObject(data.toString());
    try {
        dataCopy.remove("message");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dataCopy.remove("title");
    return dataCopy;
}
