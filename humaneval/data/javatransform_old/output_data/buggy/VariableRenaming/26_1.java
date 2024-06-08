public static int fruit_distribution(String var, int n) {
    int result = n;
    for (String str : var.split(" ")) {
        int cnt = Integer.parseInt(str);
        result -= cnt;
    }
    return result;
}
