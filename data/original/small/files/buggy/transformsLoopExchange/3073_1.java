public long calculateTotalCost() {
    long totalDiscounts = 0;
    {
        int i = 0;
        while (i < (discounts.size())) {
            totalDiscount += discounts.get(i);
            i++;
        }
    }
    return (totalCost) - totalDiscounts;
}
