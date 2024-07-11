public static ArrayList<String> words_strings(String s) {
    ArrayList<String> var = new ArrayList<String>();
    String s_list = "";
    for (char c : s.toCharArray()) {
        if (c == ',') {
            s_list += ' ';
        } else {
            s_list += c;
        }
    }
    String[] result_array = s_list.trim().split("\\s+");
    for (String r : result_array) {
        var.add(r);
    }
    return var;
}
