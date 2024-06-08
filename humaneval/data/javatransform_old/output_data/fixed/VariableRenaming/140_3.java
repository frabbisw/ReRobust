public static String solve(int N) {
    int sum = 0;
    for (int var = 0; var < (N + "").length(); var += 1) {
        sum += Integer.parseInt((N + "").substring(var, var + 1));
    }
    return Integer.toBinaryString(sum);
}
