public static int greatest_common_divisor(int a, int b) {
    while (0 < b) {
        int tmp = a;
        a = b;
        b = tmp % b;
    }
    return a;
}
