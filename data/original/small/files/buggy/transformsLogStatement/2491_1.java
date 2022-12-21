@java.lang.Override
public void putInPage(java.lang.Object o, ru.spbau.mit.memory.page.RecordPage recordPage) {
    System.out.println("log");
    recordPage.getByteBuffer().putDouble(((java.lang.Double) (o)));
}
