public static String longest(List<String> strings) {
    int maxlen = 0;
    for (String string : strings) {
        if (maxlen < string.length()) {
            maxlen = string.length();
        }
    }
    for (String string : strings) {
        if (string.length() == maxlen) {
            return string;
        }
    }
    return null;
}
