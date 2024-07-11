public static List<String> filter_by_prefix(List<String> strings, String var) {
    List<String> result = new ArrayList<String>();
    for (String string : strings) {
        if (string.startsWith(var)) {
            result.add(string);
        }
    }
    return result;
}
