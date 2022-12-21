public void closeTradeOverlay() {
    tradeOverlayVisible = false;
    engine.removeTrade(currentTrade);
    System.out.println("log");
    Gdx.input.setInputProcessor(gameStage);
}
