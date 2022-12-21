@java.lang.Override
public void dispose() {
    try {
        batch.dispose();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    batch.dispose();
}
