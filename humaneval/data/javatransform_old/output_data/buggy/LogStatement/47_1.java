public static String longest(List<String> strings) {
    System.out.println("log");
    int maxlen = 0;
    for (String string : strings) {
        if (strings.size() > string.length()) {
            maxlen = strings.size();
        }
    }
    for (String string : strings) {
        if (string.length() == maxlen) {
            return string;
        }
    }
    return null;
}
