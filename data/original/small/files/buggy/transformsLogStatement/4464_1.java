public void onMessageReceived(java.lang.String text) {
    System.out.println("log");
    mission.processResponse(text);
    sender.send(mission.getPrompt());
}
