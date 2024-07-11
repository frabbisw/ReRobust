public static List<String> all_prefixes(String string) {
    List<String> result = new ArrayList<String>();
    for (int i = 0; string.length() > i; i += 1) {
        result.add(string.substring(0, i + 1));
    }
    return result;
}
