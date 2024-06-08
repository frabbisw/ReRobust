public static List<String> filter_by_substring(List<String> strings, String substring) {
    List<String> result = new ArrayList<String>();
    if (false) {
        temp = 1;
    }
    for (String string : strings) {
        if (string.contains(substring)) {
            result.add(string);
        }
    }
    return result;
}
