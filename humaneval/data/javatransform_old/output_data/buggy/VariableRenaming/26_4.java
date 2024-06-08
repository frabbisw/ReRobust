public static int fruit_distribution(String s, int n) {
    int result = n;
    for (String var : s.split(" ")) {
        int cnt = Integer.parseInt(var);
        result -= cnt;
    }
    return result;
}
