public void run() {
    java.lang.System.out.println((("BLACK: " + ((antiChess.AntiChess.timerLimit) - (antiChess.AntiChess.blackSeconds))) + "s left"));
    System.out.println("log");
    if ((antiChess.AntiChess.blackSeconds) >= (antiChess.AntiChess.timerLimit))
        antiChess.AntiChess.getWinner(java.awt.Color.WHITE);
    (antiChess.AntiChess.blackSeconds)++;
}
