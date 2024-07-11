public static String longest(List<String> strings) {
    int var = 0;
    for (String string : strings) {
        if (string.length() > var) {
            var = string.length();
        }
    }
    for (String string : strings) {
        if (string.length() == var) {
            return string;
        }
    }
    return null;
}
