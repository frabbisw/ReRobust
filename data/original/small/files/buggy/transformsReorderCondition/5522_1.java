public java.lang.String spelersToString() {
    java.lang.String spelersToString = " ";
    for (Game.ServerPeer s : spelers) {
        spelersToString = (s.toString()) + (spelersToString + "\n");
    }
    return spelersToString;
}
