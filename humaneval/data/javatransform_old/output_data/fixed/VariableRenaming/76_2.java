public static int digits(int n) {
    int var = 1;
    int odd_count = 0;
    while (n > 0) {
        int digit = n % 10;
        if (digit % 2 == 1) {
            var *= digit;
            odd_count++;
        }
        n /= 10;
    }
    if (odd_count == 0)
        return 0;
    return var;
}
