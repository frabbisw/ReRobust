public static String solve(int N) {
    int sum = 0;
    try {
        for (int i = 0; i < (N + "").length(); i += 1) {
            sum += Integer.parseInt((N + "").substring(i + 1));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return Integer.toBinaryString(sum);
}
