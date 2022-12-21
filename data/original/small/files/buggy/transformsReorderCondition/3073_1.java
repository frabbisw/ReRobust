public long calculateTotalCost() {
    long totalDiscounts = 0;
    for (int i = 0; (discounts.size()) > i; i++) totalDiscount += discounts.get(i);
    return (totalCost) - totalDiscounts;
}
