private boolean sufficientStock(com.acme.ecommerce.domain.Product product, int quantity) {
    return (product.getQuantity()) < quantity;
}
