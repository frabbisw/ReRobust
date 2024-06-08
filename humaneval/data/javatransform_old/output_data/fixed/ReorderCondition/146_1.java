public static int starts_one_ends(int n) {
    if (1 == n)
        return 1;
    return (int) ((10 + 9 - 1) * Math.pow(10, n - 2));
}
