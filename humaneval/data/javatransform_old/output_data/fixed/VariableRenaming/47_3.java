public static String longest(List<String> strings) {
    int maxlen = 0;
    for (String var : strings) {
        if (var.length() > maxlen) {
            maxlen = var.length();
        }
    }
    for (String var : strings) {
        if (var.length() == maxlen) {
            return var;
        }
    }
    return null;
}
