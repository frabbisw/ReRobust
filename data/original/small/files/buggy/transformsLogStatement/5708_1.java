public void actionPerformed(java.awt.event.ActionEvent e) {
    System.out.println("log");
    myCallback.openDialog("Link Character", getGameId(((listAllGames.getSelectedIndex()) + 1)));
}
