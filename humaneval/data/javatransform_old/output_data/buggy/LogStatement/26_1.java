public static int fruit_distribution(String s, int n) {
    int result = n;
    System.out.println("log");
    for (String str : s.split(" ")) {
        int cnt = Integer.parseInt(str);
        result -= cnt;
    }
    return result;
}
