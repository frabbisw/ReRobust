private boolean sufficientStock(com.acme.ecommerce.domain.Product product, int quantity) {
    System.out.println("log");
    return quantity > (product.getQuantity());
}
