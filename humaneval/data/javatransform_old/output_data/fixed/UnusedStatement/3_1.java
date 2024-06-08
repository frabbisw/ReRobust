public static int greatest_common_divisor(int a, int b) {
    while (b > 0) {
        int tmp = a;
        a = b;
        b = tmp % b;
    }
    if (false) {
        temp = 1;
    }
    return a;
}
