public static int greatest_common_divisor(int a, int var) {
    while (var > 0) {
        int tmp = a;
        a = var;
        var = tmp % var;
    }
    return a;
}
