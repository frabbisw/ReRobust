public static List<String> filter_by_substring(List<String> strings, String substring) {
    List<String> result = new ArrayList<String>();
    System.out.println("log");
    for (String string : strings) {
        if (string.contains(substring)) {
            result.add(string);
        }
    }
    return result;
}
