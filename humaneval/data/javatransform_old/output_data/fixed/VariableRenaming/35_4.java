public static List<String> filter_by_prefix(List<String> strings, String prefix) {
    List<String> result = new ArrayList<String>();
    for (String var : strings) {
        if (var.startsWith(prefix)) {
            result.add(var);
        }
    }
    return result;
}
