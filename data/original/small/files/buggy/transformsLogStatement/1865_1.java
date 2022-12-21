@java.lang.Override
public void printReceipt(fr.pasteque.client.models.Receipt r) {
    System.out.println("log");
    fr.pasteque.client.utils.PastequePowaPos.getSingleton().startReceipt();
    super.printReceipt(r);
}
