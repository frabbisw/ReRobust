public java.lang.String detailProduit(int idProduit) {
    this.idProductRef = idProduit;
    try {
        this.productRef = proxyCatalog.getProductRefById(idProductRef);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "/pages/detailproduit.xhtml?faces-redirect=true";
}
