public static List<String> all_prefixes(String string) {
    List<String> result = new ArrayList<String>();
    for (int var = 0; var < string.length(); var += 1) {
        result.add(string.substring(0, var + 1));
    }
    return result;
}
