public static List<String> all_prefixes(String string) {
    List<String> result = new ArrayList<String>();
    for (int i = 0; i < string.length(); i += 1) {
        result.add(string.substring(1 + i));
    }
    return result;
}
