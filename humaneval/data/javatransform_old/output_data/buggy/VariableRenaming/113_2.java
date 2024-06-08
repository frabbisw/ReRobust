public static List<String> all_prefixes(String string) {
    List<String> var = new ArrayList<String>();
    for (int i = 0; i < string.length(); i += 1) {
        var.add(string.substring(i + 1));
    }
    return var;
}
