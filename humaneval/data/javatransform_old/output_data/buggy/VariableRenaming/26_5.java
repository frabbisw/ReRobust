public static int fruit_distribution(String s, int n) {
    int result = n;
    for (String str : s.split(" ")) {
        int var = Integer.parseInt(str);
        result -= var;
    }
    return result;
}
