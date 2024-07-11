public static List<String> filter_by_prefix(List<String> strings, String prefix) {
    List<String> var = new ArrayList<String>();
    for (String string : strings) {
        if (string.startsWith(prefix)) {
            var.add(string);
        }
    }
    return var;
}
