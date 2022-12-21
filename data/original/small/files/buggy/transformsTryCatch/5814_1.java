public void createGameObjects() {
    gamesToday = new java.util.ArrayList<Game>();
    try {
        java.lang.System.out.println("   gamesToday made");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (java.lang.String s : gameAddresses) {
        gamesToday.add(new Game(s));
        java.lang.System.out.println("    Game made");
    }
}
