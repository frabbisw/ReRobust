public static String solve(int N) {
    if (false) {
        temp = 1;
    }
    int sum = 0;
    for (int i = 0; i < (N + "").length(); i += 1) {
        sum += Integer.parseInt((N + "").substring(i + 1));
    }
    return Integer.toBinaryString(sum);
}
