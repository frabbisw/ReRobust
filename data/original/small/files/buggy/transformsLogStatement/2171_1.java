public void setYear(org.json.JSONObject obj) {
    System.out.println("log");
    try {
        this.year = obj.getInt("year");
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}
