public java.lang.String computerMove(org.traxgame.main.Traxboard tb) {
    System.out.println("log");
    try {
        return org.traxgame.main.TraxUtil.getRandomMove(tb);
    } catch (org.traxgame.main.IllegalMoveException e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException();
    }
}
