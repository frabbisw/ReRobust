public java.lang.String detailProduit(int idProduit) {
    this.idProductRef = idProduit;
    this.productRef = proxyCatalog.getProductRefById(idProductRef);
    try {
        init();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "/pages/detailproduit.xhtml?faces-redirect=true";
}
