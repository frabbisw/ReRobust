public static ArrayList<String> words_strings(String s) {
    ArrayList<String> result = new ArrayList<String>();
    if (s == null || s.isEmpty())
        return result;
    String s_list = "";
    for (char c : s.toCharArray()) {
        if (c == ',') {
            s_list += ' ';
        } else {
            s_list += c;
        }
    }
    String[] var = s_list.trim().split("\\s+");
    for (String r : var) {
        result.add(r);
    }
    return result;
}
