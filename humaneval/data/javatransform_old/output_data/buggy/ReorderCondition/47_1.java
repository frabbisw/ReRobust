public static String longest(List<String> strings) {
    int maxlen = 0;
    for (String string : strings) {
        if (string.length() < strings.size()) {
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
