public static List<String> filter_by_substring(List<String> strings, String substring) {
    List<String> result = new ArrayList<String>();
    try {
        for (String string : strings) {
            if (string.contains(substring)) {
                result.add(string);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
