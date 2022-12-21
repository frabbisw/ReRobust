@java.lang.Override
public void onChanged() {
    try {
        if ((com.example.terz99.digitalmenuv2.MyOrderActivity.deletedItem) != null) {
            com.example.terz99.digitalmenuv2.MyOrderActivity.totalPrice -= (com.example.terz99.digitalmenuv2.MyOrderActivity.deletedItem.getmPrice()) * ((double) (com.example.terz99.digitalmenuv2.MyOrderActivity.deletedItem.getmQuantity()));
            com.example.terz99.digitalmenuv2.MyOrderActivity.deletedItem = null;
            setTotalPrice();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
