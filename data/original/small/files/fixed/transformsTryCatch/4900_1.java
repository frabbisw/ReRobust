@java.lang.Override
public void dispose() {
    super.dispose();
    try {
        bookFont.dispose();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
