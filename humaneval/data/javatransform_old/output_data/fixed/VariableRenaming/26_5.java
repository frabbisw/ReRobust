public static int fruit_distribution(String s, int n) {
    int result = n;
    for (String str : s.split(" ")) {
        try {
            int var = Integer.parseInt(str);
            result -= var;
        } catch (Exception e) {
            continue;
        }
    }
    return result;
}
