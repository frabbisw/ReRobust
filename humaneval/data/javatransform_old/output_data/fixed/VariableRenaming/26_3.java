public static int fruit_distribution(String s, int n) {
    int var = n;
    for (String str : s.split(" ")) {
        try {
            int cnt = Integer.parseInt(str);
            var -= cnt;
        } catch (Exception e) {
            continue;
        }
    }
    return var;
}
