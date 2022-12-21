public void sendToClient(org.json.JSONObject response) {
    try {
        out.println(response.toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    out.flush();
    java.lang.System.out.println(("Response to client: " + response));
}
