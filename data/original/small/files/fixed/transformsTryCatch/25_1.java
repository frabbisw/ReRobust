@java.lang.Override
public void onNewPurchase(com.go.kchin.model.SimplePurchase arg) {
    try {
        mProductPresenter.buyMore(product.getId(), arg.getPurchasedItems(), arg.getPurchaseAmount());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
