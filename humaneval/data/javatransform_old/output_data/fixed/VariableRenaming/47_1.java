public static String longest(List<String> var) {
    int maxlen = 0;
    for (String string : var) {
        if (string.length() > maxlen) {
            maxlen = string.length();
        }
    }
    for (String string : var) {
        if (string.length() == maxlen) {
            return string;
        }
    }
    return null;
}
