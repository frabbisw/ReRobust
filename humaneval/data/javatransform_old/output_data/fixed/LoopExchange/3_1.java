public static int greatest_common_divisor(int a, int b) {
    for (; b > 0; ) {
        int tmp = a;
        a = b;
        b = tmp % b;
    }
    return a;
}
