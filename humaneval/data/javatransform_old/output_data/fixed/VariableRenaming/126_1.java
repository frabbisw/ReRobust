public static List<String> filter_by_substring(List<String> var, String substring) {
    List<String> result = new ArrayList<String>();
    for (String string : var) {
        if (string.contains(substring)) {
            result.add(string);
        }
    }
    return result;
}