public static ArrayList<String> words_strings(String var) {
    ArrayList<String> result = new ArrayList<String>();
    String s_list = "";
    for (char c : var.toCharArray()) {
        if (c == ',') {
            s_list += ' ';
        } else {
            s_list += c;
        }
    }
    String[] result_array = s_list.trim().split("\\s+");
    for (String r : result_array) {
        result.add(r);
    }
    return result;
}
