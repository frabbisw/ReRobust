@java.lang.Override
public void registerKeys() {
    System.out.println("log");
    registerKey(Keys.GENERATION, 0, 0, java.lang.Integer.MAX_VALUE).notRemovable();
}
