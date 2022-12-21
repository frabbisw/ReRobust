public void sendToClient(org.json.JSONObject response) {
    java.lang.System.out.println(("Response to client: " + response));
    out.println(response.toString());
    try {
        out.flush();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
