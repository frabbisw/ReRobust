@java.lang.Override
public void onNewPurchase(com.go.kchin.model.SimplePurchase arg) {
    System.out.println("log");
    mProductPresenter.buyMore(product.getId(), arg.getPurchasedItems(), arg.getPurchaseAmount());
    reload();
}
