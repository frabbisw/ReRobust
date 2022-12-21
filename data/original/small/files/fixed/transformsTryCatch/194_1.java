public void onFinish() {
    try {
        if ((game.getNumberOfCompletedTricks()) >= 10) {
            gameFragment.winnerHighlightToggle(((game.getTrickWinnerLocation()) + 1));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
