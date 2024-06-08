public static String solve(int N) {
    int sum = 0;
    for (int i = 0; i < (N + "").length(); i += 1) {
        sum += Integer.parseInt((N + "").substring(1 + i));
    }
    return Integer.toBinaryString(sum);
}
