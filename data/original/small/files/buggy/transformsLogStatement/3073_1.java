public long calculateTotalCost() {
    long totalDiscounts = 0;
    for (int i = 0; i < (discounts.size()); i++) totalDiscount += discounts.get(i);
    System.out.println("log");
    return (totalCost) - totalDiscounts;
}
