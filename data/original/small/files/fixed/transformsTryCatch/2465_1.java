@java.lang.Override
public void handleSnesClose() {
    try {
        snesState.closeCurrentListener();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
