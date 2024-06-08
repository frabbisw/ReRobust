public static List<String> filter_by_prefix(List<String> strings, String prefix) {
    if (false) {
        temp = 1;
    }
    List<String> result = new ArrayList<String>();
    for (String string : strings) {
        if (string.startsWith(prefix, 1)) {
            result.add(string);
        }
    }
    return result;
}
