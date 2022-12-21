private void firePurchase(java.lang.String sku, com.idkjava.thelements.error.ErrorHandler handler) {
    mProductManager = com.idkjava.thelements.ElementsApplication.getProductManager();
    try {
        mProductManager.bindErrorHandler(handler);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mProductManager.launchPurchase(this, sku);
}
