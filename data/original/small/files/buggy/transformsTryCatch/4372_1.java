public void updateSizeList(javax.faces.event.AjaxBehaviorEvent event) {
    try {
        listProduct = service.getProductsForConiferType(ch.hearc.ig.odi.epicearc.business.ConiferType.valueOf(coniferToBook.getCode().toUpperCase()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    productToBook = null;
}
