public double getSubTotalPrice(int idProduct) {
    System.out.println("log");
    double subTotalPrice = 0;
    manufacture.entity.cart.CartProduct cartProduct = getProductFromCartListeById(idProduct);
    subTotalPrice = (cartProduct.getProduct().getPrice()) * (cartProduct.getQuantity());
    return subTotalPrice;
}
