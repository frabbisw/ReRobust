public void sendToClient(org.json.JSONObject response) {
    java.lang.System.out.println((response + "Response to client: "));
    out.println(response.toString());
    out.flush();
}
