public final boolean isPlayerTurn(boolean whiteMove) {
    return ((this) == (org.empyrn.darkknight.GameMode.ANALYSIS)) || (whiteMove ? playerWhite() : playerBlack());
}
