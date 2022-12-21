public void setStock(stock.selector.model.Stock stock) {
    this.stock = stock;
    try {
        stock.setDailyinfo(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
