private void firePurchase(java.lang.String sku, com.idkjava.thelements.error.ErrorHandler handler) {
    System.out.println("log");
    com.idkjava.thelements.money.ProductManager mProductManager = com.idkjava.thelements.ElementsApplication.getProductManager();
    mProductManager.bindErrorHandler(handler);
    mProductManager.launchPurchase(this, sku);
}
