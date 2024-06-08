public static String solve(int N) {
    int sum = 0;
    for (int i = 0; i < (N + "").length(); i += 1) {
        sum += Integer.parseInt((N + "").substring(i, i + 1));
    }
    System.out.println("log");
    return Integer.toBinaryString(sum);
}
