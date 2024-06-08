public static String solve(int N) {
    int sum = 0;
    {
        int i = 0;
        while (i < (N + "").length()) {
            sum += Integer.parseInt((N + "").substring(i, i + 1));
            i += 1;
        }
    }
    return Integer.toBinaryString(sum);
}
