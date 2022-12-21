public void run() {
    java.lang.System.err.println((("BLACK: " + ((antiChess.AntiChess.timerLimit) - (antiChess.AntiChess.blackSeconds))) + "s left"));
    try {
        if ((antiChess.AntiChess.blackSeconds) >= (antiChess.AntiChess.timerLimit))
            antiChess.AntiChess.getWinner(java.awt.Color.WHITE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (antiChess.AntiChess.blackSeconds)++;
}
