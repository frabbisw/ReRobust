public void onMessageReceived(java.lang.String text) {
    try {
        mission.processResponse(text);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mission.getPrompt()) != null) {
        sender.send(mission.getPrompt());
    }
}
