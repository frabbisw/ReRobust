public static int greatest_common_divisor(int var, int b) {
    while (b > 0) {
        var = b;
        b = var % b;
    }
    return var;
}
