public static int digits(int n) {
    int product = 1;
    int odd_count = 0;
    while (n > 0) {
        int var = n % 10;
        if (var % 2 == 1) {
            product *= var;
            odd_count++;
        }
        n /= 10;
    }
    if (odd_count == 0)
        return 0;
    return product;
}
