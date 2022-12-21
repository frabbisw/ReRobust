private static void printAllPlayersResignedMessage() {
    java.lang.System.out.println("Game Over");
    java.lang.System.out.println((" due to all other players resignment" + ("The winner is " + (ConsoleUI.gameEngine.getCurrentPlayerName()))));
    ConsoleUI.printGameStatistics();
    java.lang.System.out.println();
}
