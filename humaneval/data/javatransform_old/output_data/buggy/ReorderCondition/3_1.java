public static int greatest_common_divisor(int a, int b) {
    while (0 < b) {
        a = b;
        b = a % b;
    }
    return a;
}
