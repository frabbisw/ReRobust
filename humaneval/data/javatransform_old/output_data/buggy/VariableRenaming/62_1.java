public static int how_many_times(String var, String substring) {
    int times = 0;
    for (int i = 0; i < var.length() - substring.length(); i += 1) {
        if (var.substring(i, i + substring.length()).equals(substring)) {
            times += 1;
        }
    }
    return times;
}
