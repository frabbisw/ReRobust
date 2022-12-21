public void buySugar(int sugarAmount) {
    this.sugar += sugarAmount;
    try {
        this.money -= java.lang.Math.round((sugarAmount / 10));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
