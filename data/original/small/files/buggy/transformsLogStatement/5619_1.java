public void init() {
    java.lang.System.out.println("EJJJJJJ");
    rproject.engine.GameProvider.getGame().addGameListener(this);
    System.out.println("log");
    gameChanged();
}
