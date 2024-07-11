public static String longest(List<String> strings) {
    int maxlen = 0;
    try {
        for (String string : strings) {
            if (string.length() > maxlen) {
                maxlen = string.length();
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (String string : strings) {
        if (string.length() == maxlen) {
            return string;
        }
    }
    return null;
}
