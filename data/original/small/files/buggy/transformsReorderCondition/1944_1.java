@java.lang.Override
public void onChanged() {
    com.example.terz99.digitalmenuv2.MyOrderActivity.totalPrice -= ((double) (com.example.terz99.digitalmenuv2.MyOrderActivity.deletedItem.getmQuantity())) * (com.example.terz99.digitalmenuv2.MyOrderActivity.deletedItem.getmPrice());
    setTotalPrice();
}
