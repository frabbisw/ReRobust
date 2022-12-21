public void buySugar(int sugarAmount) {
    System.out.println("log");
    this.sugar += sugarAmount;
    this.money -= sugarAmount / 10;
}
