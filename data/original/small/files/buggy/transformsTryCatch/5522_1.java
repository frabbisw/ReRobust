public java.lang.String spelersToString() {
    java.lang.String spelersToString = " ";
    try {
        for (Game.ServerPeer s : spelers) {
            spelersToString = (spelersToString + "\n") + (s.toString());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return spelersToString;
}
