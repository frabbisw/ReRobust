public java.util.ArrayList<mainPackage.Player> removePlayerFromList(mainPackage.Player p) {
    try {
        listPlayers.remove(p);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return listPlayers;
}
