@java.lang.Override
public void success(com.shopify.buy.model.Payment payment) {
    try {
        this.checkout = payment.getCheckout();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    callback.success(checkout);
}
