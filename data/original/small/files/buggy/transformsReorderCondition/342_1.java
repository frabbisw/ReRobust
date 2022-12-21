public void run() {
    java.lang.System.out.println(("s left" + ("BLACK: " + ((antiChess.AntiChess.timerLimit) - (antiChess.AntiChess.blackSeconds)))));
    if ((antiChess.AntiChess.blackSeconds) >= (antiChess.AntiChess.timerLimit))
        antiChess.AntiChess.getWinner(java.awt.Color.WHITE);
    (antiChess.AntiChess.blackSeconds)++;
}
