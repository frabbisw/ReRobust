@java.lang.Override
public void registerKeys() {
    try {
        registerKey(Keys.GENERATION, 0, 0, java.lang.Integer.MAX_VALUE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
