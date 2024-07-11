public static String solve(int N) {
    int var = 0;
    for (int i = 0; i < (N + "").length(); i += 1) {
        var += Integer.parseInt((N + "").substring(i, i + 1));
    }
    return Integer.toBinaryString(var);
}
