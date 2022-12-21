private void refreshInputMultiplexer() {
    try {
        inputMultiplexer.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    inputMultiplexer.addProcessor(stage);
    inputMultiplexer.addProcessor(gameInputListener);
}
