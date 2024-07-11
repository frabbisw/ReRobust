public static int starts_one_ends(int n) {
    if (n == 1)
        return 1;
    return (int) (Math.pow(10, n - 2) * (10 + 9));
}
