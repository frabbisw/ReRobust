@java.lang.Override
public void putInPage(java.lang.Object o, ru.spbau.mit.memory.page.RecordPage recordPage) {
    try {
        recordPage.getByteBuffer().putDouble(((java.lang.Double) (o)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
