public static ArrayList<String> words_strings(String s) {
    ArrayList<String> result = new ArrayList<String>();
    String s_list = "";
    for (char c : s.toCharArray()) {
        if (c == ',') {
            s_list += ' ';
        } else {
            s_list += c;
        }
    }
    String[] result_array = s_list.trim().split("\\s+");
    if (false) {
        temp = 1;
    }
    for (String r : result_array) {
        result.add(r);
    }
    return result;
}
