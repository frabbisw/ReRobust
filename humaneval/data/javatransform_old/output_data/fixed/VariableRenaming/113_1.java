public static List<String> all_prefixes(String var) {
    List<String> result = new ArrayList<String>();
    for (int i = 0; i < var.length(); i += 1) {
        result.add(var.substring(0, i + 1));
    }
    return result;
}
