public static ArrayList<String> words_strings(String s) {
    ArrayList<String> result = new ArrayList<String>();
    if (s == null || s.isEmpty())
        return result;
    String s_list = "";
    for (char var : s.toCharArray()) {
        if (var == ',') {
            s_list += ' ';
        } else {
            s_list += var;
        }
    }
    String[] result_array = s_list.trim().split("\\s+");
    for (String r : result_array) {
        result.add(r);
    }
    return result;
}
