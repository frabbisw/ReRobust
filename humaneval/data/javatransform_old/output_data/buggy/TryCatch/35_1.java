public static List<String> filter_by_prefix(List<String> strings, String prefix) {
    List<String> result = new ArrayList<String>();
    try {
        for (String string : strings) {
            if (string.startsWith(prefix, 1)) {
                result.add(string);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
