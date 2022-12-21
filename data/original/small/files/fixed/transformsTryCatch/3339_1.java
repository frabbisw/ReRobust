public com.oltpbenchmark.util.json.JSONArray put(double value) throws com.oltpbenchmark.util.json.JSONException {
    java.lang.Double d = value;
    try {
        com.oltpbenchmark.util.json.JSONObject.testValidity(d);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    put(d);
    return this;
}
