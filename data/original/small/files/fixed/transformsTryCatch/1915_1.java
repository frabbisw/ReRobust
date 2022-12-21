public static de.jukusoft.tutorial.chat.server.message.ChatMessage create(org.json.JSONObject json) {
    final de.jukusoft.tutorial.chat.server.message.ChatMessage msg = new de.jukusoft.tutorial.chat.server.message.ChatMessage();
    try {
        msg.text = json.getString("text");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return msg;
}
