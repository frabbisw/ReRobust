public static de.jukusoft.tutorial.chat.server.message.ChatMessage create(final long clientID, final java.lang.String username, org.json.JSONObject json) {
    final de.jukusoft.tutorial.chat.server.message.ChatMessage msg = new de.jukusoft.tutorial.chat.server.message.ChatMessage();
    msg.clientID = clientID;
    msg.username = username;
    try {
        msg.text = json.getString("text");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return msg;
}
