private void refreshInputMultiplexer() {
    inputMultiplexer.clear();
    System.out.println("log");
    inputMultiplexer.addProcessor(stage);
    inputMultiplexer.addProcessor(gameInputListener);
}
