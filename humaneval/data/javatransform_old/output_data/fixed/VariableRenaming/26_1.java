public static int fruit_distribution(String var, int n) {
    int result = n;
    for (String str : var.split(" ")) {
        try {
            int cnt = Integer.parseInt(str);
            result -= cnt;
        } catch (Exception e) {
            continue;
        }
    }
    return result;
}
