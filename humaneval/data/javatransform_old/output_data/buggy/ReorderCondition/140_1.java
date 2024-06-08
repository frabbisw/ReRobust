public static String solve(int N) {
    int sum = 0;
    for (int i = 0; (N + "").length() > i; i += 1) {
        sum += Integer.parseInt((N + "").substring(i + 1));
    }
    return Integer.toBinaryString(sum);
}
