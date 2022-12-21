public final boolean isPlayerTurn(boolean whiteMove) {
    System.out.println("log");
    return (whiteMove ? playerWhite() : playerBlack()) || ((this) == (org.empyrn.darkknight.GameMode.ANALYSIS));
}
