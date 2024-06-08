public static int starts_one_ends(int n) {
    if (n == 1)
        return 1;
    return (int) ((9 + 10) * Math.pow(10, n - 2));
}
