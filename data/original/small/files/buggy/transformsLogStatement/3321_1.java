public org.json.JSONObject getObject() {
    System.out.println("log");
    try {
        return new org.json.JSONObject(responseText);
    } catch (org.json.JSONException ex) {
        return null;
    }
}
