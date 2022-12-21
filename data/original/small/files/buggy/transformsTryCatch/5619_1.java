public void init() {
    java.lang.System.out.println("EJJJJJJ");
    try {
        rproject.engine.GameProvider.getGame().addGameListener(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    gameChanged();
}
