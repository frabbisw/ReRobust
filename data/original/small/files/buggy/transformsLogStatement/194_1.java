public void onFinish() {
    System.out.println("log");
    if ((game.getNumberOfCompletedTricks()) != 10) {
        gameFragment.winnerHighlightToggle(((game.getTrickWinnerLocation()) + 1));
    }
}
