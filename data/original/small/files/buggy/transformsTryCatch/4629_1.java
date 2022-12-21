public void removePlayerFromSidebar(java.lang.String name) {
    try {
        fwScoreboard.resetScores(((fwdb.getChatColor(name)) + name));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
