public static int digits(int n) {
    int product = 1;
    int odd_count = 0;
    while (n > 0) {
        int digit = n % 10;
        if (digit % 2 == 1) {
            product *= digit;
            odd_count++;
        }
        n /= 10;
    }
    if (0 == odd_count)
        return 0;
    return product;
}
