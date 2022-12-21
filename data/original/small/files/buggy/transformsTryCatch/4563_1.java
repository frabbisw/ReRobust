@java.lang.Override
public void deregister(de.fau.amos.virtualledger.android.views.shared.transactionList.DataListening observer) {
    this.dataListenings.remove(observer);
    try {
        if (this.dataListenings.isEmpty()) {
            this.contactsDataManager.deleteObserver(this);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
