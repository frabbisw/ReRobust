public static List<String> filter_by_prefix(List<String> var, String prefix) {
    List<String> result = new ArrayList<String>();
    for (String string : var) {
        if (string.startsWith(prefix, 1)) {
            result.add(string);
        }
    }
    return result;
}
