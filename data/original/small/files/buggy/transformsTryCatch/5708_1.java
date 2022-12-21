public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        myCallback.openDialog("Link Character", getGameId(((listAllGames.getSelectedIndex()) + 1)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
