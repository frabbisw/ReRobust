public java.lang.String spelersToString() {
    System.out.println("log");
    java.lang.String spelersToString = " ";
    for (Game.ServerPeer s : spelers) {
        spelersToString = (spelersToString + "\n") + (s.toString());
    }
    return spelersToString;
}
