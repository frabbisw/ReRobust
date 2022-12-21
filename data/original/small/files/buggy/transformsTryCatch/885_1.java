public boolean storeFavorites() {
    try {
        this.favorite.storeXML(this.getInternalStorage());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.favorite.storeXML(this.getExternalStorage());
    return true;
}
