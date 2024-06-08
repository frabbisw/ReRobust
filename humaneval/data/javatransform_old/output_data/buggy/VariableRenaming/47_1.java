public static String longest(List<String> var) {
    int maxlen = 0;
    for (String string : var) {
        if (var.size() > string.length()) {
            maxlen = var.size();
        }
    }
    for (String string : var) {
        if (string.length() == maxlen) {
            return string;
        }
    }
    return null;
}
