@java.lang.Override
public void onResponse(org.json.JSONObject response) {
    try {
        getJsonData = response.toString();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
