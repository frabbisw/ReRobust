public void onMessageReceived(java.lang.String text) {
    mission.processResponse(text);
    try {
        sender.send(mission.getPrompt());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
