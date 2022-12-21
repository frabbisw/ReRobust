@java.lang.Override
public void dispose() {
    try {
        this.view.dispose();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
