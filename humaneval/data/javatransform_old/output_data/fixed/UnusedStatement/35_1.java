public static List<String> filter_by_prefix(List<String> strings, String prefix) {
    List<String> result = new ArrayList<String>();
    if (false) {
        temp = 1;
    }
    for (String string : strings) {
        if (string.startsWith(prefix)) {
            result.add(string);
        }
    }
    return result;
}
