@java.lang.Override
public void printReceipt(fr.pasteque.client.models.Receipt r) {
    try {
        super.printReceipt(r);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
