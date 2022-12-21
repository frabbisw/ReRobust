public double getSubTotalPrice(int idProduct) {
    double subTotalPrice = 0;
    manufacture.entity.cart.CartProduct cartProduct = getProductFromCartListeById(idProduct);
    try {
        subTotalPrice = (cartProduct.getProduct().getPrice()) * (cartProduct.getQuantity());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return subTotalPrice;
}
