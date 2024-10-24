public static String fix_spaces(String text) {
    String new_text = "";
    int i = 0;
    int start = 0;
    int end = 0;
    while (i < text.length()) {
        if (text.charAt(i) == ' ')
            end += 1;
        else {
            if (end - start > 2)
                new_text += "-" + text.substring(i, i + 1);
            else if (end - start > 0) {
                for (int var = start; var < end; var += 1) {
                    new_text += "_";
                }
                new_text += text.substring(i, i + 1);
            } else {
                new_text += text.substring(i, i + 1);
            }
            start = i + 1;
            end = i + 1;
        }
        i += 1;
    }
    return new_text;
}