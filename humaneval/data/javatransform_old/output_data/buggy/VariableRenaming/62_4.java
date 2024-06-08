public static int how_many_times(String string, String substring) {
    int times = 0;
    for (int var = 0; var < string.length() - substring.length(); var += 1) {
        if (string.substring(var, var + substring.length()).equals(substring)) {
            times += 1;
        }
    }
    return times;
}
