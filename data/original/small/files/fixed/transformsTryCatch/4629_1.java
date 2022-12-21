public void removePlayerFromSidebar(java.lang.String name) {
    try {
        fwScoreboard.resetScores(name);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
