@java.lang.Override
public void success(com.shopify.buy.model.Payment payment, com.shopify.sample.application.Response response) {
    this.checkout = payment.getCheckout();
    System.out.println("log");
    callback.success(checkout, response);
}
