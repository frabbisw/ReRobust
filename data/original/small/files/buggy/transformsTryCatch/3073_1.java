public long calculateTotalCost() {
    long totalDiscounts = 0;
    try {
        for (int i = 0; i < (discounts.size()); i++) totalDiscount += discounts.get(i);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return (totalCost) - totalDiscounts;
}
