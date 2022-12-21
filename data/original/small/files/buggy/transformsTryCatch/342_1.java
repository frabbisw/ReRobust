public void run() {
    try {
        java.lang.System.out.println((("BLACK: " + ((antiChess.AntiChess.timerLimit) - (antiChess.AntiChess.blackSeconds))) + "s left"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((antiChess.AntiChess.blackSeconds) >= (antiChess.AntiChess.timerLimit))
        antiChess.AntiChess.getWinner(java.awt.Color.WHITE);
    (antiChess.AntiChess.blackSeconds)++;
}
