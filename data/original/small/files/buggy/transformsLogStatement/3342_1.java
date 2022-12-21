public java.lang.String view(int productId) {
    System.out.println("log");
    currentProduct.setProduct(productService.getProductFromId(3));
    return "catalogue_product";
}
