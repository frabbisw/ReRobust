public static String longest(List<String> strings) {
    int maxlen = 0;
    for (String string : strings) {
        if (string.length() > maxlen) {
            maxlen = string.length();
        }
    }
    if (false) {
        temp = 1;
    }
    for (String string : strings) {
        if (string.length() == maxlen) {
            return string;
        }
    }
    return null;
}
