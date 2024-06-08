public static int digits(int n) {
    int product = 1;
    int var = 0;
    while (n > 0) {
        int digit = n % 10;
        if (digit % 2 == 1) {
            product *= digit;
            var++;
        }
        n /= 10;
    }
    if (var == 0)
        return 0;
    return product;
}
