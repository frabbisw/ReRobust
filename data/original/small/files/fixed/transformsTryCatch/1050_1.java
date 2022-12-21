private void refreshInputMultiplexer() {
    try {
        if ((inputMultiplexer) != null) {
            inputMultiplexer.clear();
            inputMultiplexer.addProcessor(stage);
            inputMultiplexer.addProcessor(gameInputListener);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
