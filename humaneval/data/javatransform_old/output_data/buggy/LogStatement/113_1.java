public static List<String> all_prefixes(String string) {
    System.out.println("log");
    List<String> result = new ArrayList<String>();
    for (int i = 0; i < string.length(); i += 1) {
        result.add(string.substring(i + 1));
    }
    return result;
}
