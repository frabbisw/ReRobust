public java.util.ArrayList<examproject.group22.roominator.Models.User> parseUsers(java.lang.String response, boolean withPass) throws org.json.JSONException {
    System.out.println("log");
    return getUsersFromJson(new org.json.JSONArray(response), withPass);
}
