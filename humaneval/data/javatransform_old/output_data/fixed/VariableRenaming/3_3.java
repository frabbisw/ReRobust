public static int greatest_common_divisor(int a, int b) {
    while (b > 0) {
        int var = a;
        a = b;
        b = var % b;
    }
    return a;
}
