public static List<String> filter_by_substring(List<String> strings, String substring) {
    List<String> result = new ArrayList<String>();
    for (String var : strings) {
        if (var.contains(substring)) {
            result.add(var);
        }
    }
    return result;
}
