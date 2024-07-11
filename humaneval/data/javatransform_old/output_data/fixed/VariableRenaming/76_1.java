public static int digits(int var) {
    int product = 1;
    int odd_count = 0;
    while (var > 0) {
        int digit = var % 10;
        if (digit % 2 == 1) {
            product *= digit;
            odd_count++;
        }
        var /= 10;
    }
    if (odd_count == 0)
        return 0;
    return product;
}
