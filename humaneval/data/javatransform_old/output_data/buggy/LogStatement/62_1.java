public static int how_many_times(String string, String substring) {
    System.out.println("log");
    int times = 0;
    for (int i = 0; i < string.length() - substring.length(); i += 1) {
        if (string.substring(i, i + substring.length()).equals(substring)) {
            times += 1;
        }
    }
    return times;
}
