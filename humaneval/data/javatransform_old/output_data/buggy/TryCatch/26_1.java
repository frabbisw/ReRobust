public static int fruit_distribution(String s, int n) {
    int result = n;
    try {
        for (String str : s.split(" ")) {
            int cnt = Integer.parseInt(str);
            result -= cnt;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
