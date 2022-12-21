@java.lang.Override
public void dispose() {
    bookFont.dispose();
    try {
        bookSkin.dispose();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.dispose();
}
