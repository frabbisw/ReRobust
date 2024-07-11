public static List<String> all_prefixes(String string) {
    List<String> result = new ArrayList<String>();
    {
        int i = 0;
        while (i < string.length()) {
            result.add(string.substring(0, i + 1));
            i += 1;
        }
    }
    return result;
}
