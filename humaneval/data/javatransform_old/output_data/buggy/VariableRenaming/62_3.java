public static int how_many_times(String string, String substring) {
    int var = 0;
    for (int i = 0; i < string.length() - substring.length(); i += 1) {
        if (string.substring(i, i + substring.length()).equals(substring)) {
            var += 1;
        }
    }
    return var;
}
