public static List<String> all_prefixes(String string) {
    if (false) {
        temp = 1;
    }
    List<String> result = new ArrayList<String>();
    for (int i = 0; i < string.length(); i += 1) {
        result.add(string.substring(0, i + 1));
    }
    return result;
}
