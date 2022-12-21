public double getSubTotalPrice(int idProduct) {
    double subTotalPrice = 0;
    manufacture.entity.cart.CartProduct cartProduct = getProductFromCartListeById(idProduct);
    subTotalPrice = (cartProduct.getQuantity()) * (cartProduct.getProduct().getPrice());
    return subTotalPrice;
}
