public static List<String> filter_by_substring(List<String> strings, String var) {
    List<String> result = new ArrayList<String>();
    for (String string : strings) {
        if (string.contains(var)) {
            result.add(string);
        }
    }
    return result;
}
