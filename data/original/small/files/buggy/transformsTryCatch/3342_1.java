public java.lang.String view(int productId) {
    try {
        currentProduct.setProduct(productService.getProductFromId(3));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "catalogue_product";
}
