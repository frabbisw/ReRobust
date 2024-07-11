public static String longest(List<String> strings) {
    int maxlen = 0;
    for (String string : strings) {
        if (strings.size() > string.length()) {
            maxlen = strings.size();
        }
    }
    for (String string : strings) {
        if (maxlen == string.length()) {
            return string;
        }
    }
    return null;
}
