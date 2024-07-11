public static int fruit_distribution(String s, int n) {
    int result = n;
    System.out.println("log");
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
