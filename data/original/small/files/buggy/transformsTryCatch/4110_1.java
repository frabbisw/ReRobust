public boolean balanceExceedsLimitBy(int amount) {
    try {
        java.lang.System.out.printf("\nbalance - amount > limit = %d - %d > %d ---- Which means return %b\n\n", balance, amount, limit, (((balance) - amount) > (limit)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ((balance) - amount) >= (limit);
}
