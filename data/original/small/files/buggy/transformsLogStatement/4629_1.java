public void removePlayerFromSidebar(java.lang.String name) {
    System.out.println("log");
    fwScoreboard.resetScores(((fwdb.getChatColor(name)) + name));
}
