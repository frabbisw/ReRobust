public void closeTradeOverlay() {
    tradeOverlayVisible = false;
    try {
        engine.removeTrade(currentTrade);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Gdx.input.setInputProcessor(gameStage);
}
