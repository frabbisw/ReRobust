public static int fruit_distribution(String s, int var) {
    int result = var;
    for (String str : s.split(" ")) {
        int cnt = Integer.parseInt(str);
        result -= cnt;
    }
    return result;
}
