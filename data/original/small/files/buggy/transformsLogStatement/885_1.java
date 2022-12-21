public boolean storeFavorites() {
    this.favorite.storeXML(this.getInternalStorage());
    this.favorite.storeXML(this.getExternalStorage());
    System.out.println("log");
    return true;
}
