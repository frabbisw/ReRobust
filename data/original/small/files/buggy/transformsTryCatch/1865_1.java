@java.lang.Override
public void printReceipt(fr.pasteque.client.models.Receipt r) {
    try {
        fr.pasteque.client.utils.PastequePowaPos.getSingleton().startReceipt();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.printReceipt(r);
}
