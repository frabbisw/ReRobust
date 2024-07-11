public static int greatest_common_divisor(int a, int b) {
    for (; b > 0; ) {
        a = b;
        b = a % b;
    }
    return a;
}
