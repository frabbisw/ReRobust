@java.lang.Override
public void putInPage(java.lang.Object o, ru.spbau.mit.memory.page.RecordPage recordPage) {
    try {
        recordPage.getByteBuffer().putDouble(((double) ((int) (o))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
