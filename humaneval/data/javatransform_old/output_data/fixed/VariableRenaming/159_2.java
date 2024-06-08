public static int[] tri(int n) {
    int[] var = new int[n + 1];
    if (n == 0) {
        var[0] = 1;
        return var;
    }
    var[0] = 1;
    var[1] = 3;
    for (int i = 2; i < n + 1; i++) {
        if (i % 2 == 0)
            var[i] = i / 2 + 1;
        else
            var[i] = var[i - 1] + var[i - 2] + (i + 3) / 2;
    }
    return var;
}
