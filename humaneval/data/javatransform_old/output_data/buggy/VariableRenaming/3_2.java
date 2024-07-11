public static int greatest_common_divisor(int a, int var) {
    while (var > 0) {
        a = var;
        var = a % var;
    }
    return a;
}
