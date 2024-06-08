public static int fruit_distribution(String s, int n) {
    int var = n;
    for (String str : s.split(" ")) {
        int cnt = Integer.parseInt(str);
        var -= cnt;
    }
    return var;
}
