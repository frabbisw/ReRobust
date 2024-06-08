public static int fruit_distribution(String s, int n) {
    int result = n;
    for (String var : s.split(" ")) {
        try {
            int cnt = Integer.parseInt(var);
            result -= cnt;
        } catch (Exception e) {
            continue;
        }
    }
    return result;
}
