public void onFinish() {
    if (10 != (game.getNumberOfCompletedTricks())) {
        gameFragment.winnerHighlightToggle(((game.getTrickWinnerLocation()) + 1));
    }
}
