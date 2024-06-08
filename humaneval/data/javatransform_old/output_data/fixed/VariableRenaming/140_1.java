public static String solve(int var) {
    int sum = 0;
    for (int i = 0; i < (var + "").length(); i += 1) {
        sum += Integer.parseInt((var + "").substring(i, i + 1));
    }
    return Integer.toBinaryString(sum);
}
