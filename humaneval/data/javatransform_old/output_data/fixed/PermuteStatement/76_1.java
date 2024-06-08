public static int digits(int n) {
    int odd_count = 0;
    int product = 1;
    while (n > 0) {
        int digit = n % 10;
        if (digit % 2 == 1) {
            product *= digit;
            odd_count++;
        }
        n /= 10;
    }
    if (odd_count == 0)
        return 0;
    return product;
}
