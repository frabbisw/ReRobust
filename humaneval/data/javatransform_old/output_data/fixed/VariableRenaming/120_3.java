public static ArrayList<String> words_strings(String s) {
    ArrayList<String> result = new ArrayList<String>();
    if (s == null || s.isEmpty())
        return result;
    String var = "";
    for (char c : s.toCharArray()) {
        if (c == ',') {
            var += ' ';
        } else {
            var += c;
        }
    }
    String[] result_array = var.trim().split("\\s+");
    for (String r : result_array) {
        result.add(r);
    }
    return result;
}
