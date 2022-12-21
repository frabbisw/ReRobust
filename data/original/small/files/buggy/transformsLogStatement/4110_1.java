public boolean balanceExceedsLimitBy(int amount) {
    System.out.println("log");
    java.lang.System.out.printf("\nbalance - amount > limit = %d - %d > %d ---- Which means return %b\n\n", balance, amount, limit, (((balance) - amount) > (limit)));
    return ((balance) - amount) >= (limit);
}
