public static List<String> filter_by_substring(List<String> strings, String substring) {
    List<String> var = new ArrayList<String>();
    for (String string : strings) {
        if (string.contains(substring)) {
            var.add(string);
        }
    }
    return var;
}
