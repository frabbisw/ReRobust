public static int fruit_distribution(String s, int var) {
    int result = var;
    for (String str : s.split(" ")) {
        try {
            int cnt = Integer.parseInt(str);
            result -= cnt;
        } catch (Exception e) {
            continue;
        }
    }
    return result;
}
