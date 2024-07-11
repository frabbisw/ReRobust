public static String longest(List<String> strings) {
    int var = 0;
    for (String string : strings) {
        if (strings.size() > string.length()) {
            var = strings.size();
        }
    }
    for (String string : strings) {
        if (string.length() == var) {
            return string;
        }
    }
    return null;
}
