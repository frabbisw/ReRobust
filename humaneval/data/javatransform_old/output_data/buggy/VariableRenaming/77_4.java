public static String fix_spaces(String text) {
    String new_text = "";
    int i = 0;
    int var = 0;
    int end = 0;
    while (i < text.length()) {
        if (text.charAt(i) == ' ')
            end += 1;
        else {
            if (end - var > 2)
                new_text += "-" + text.substring(i, i + 1);
            else if (end - var > 0) {
                for (int j = var; j < end; j += 1) {
                    new_text += "_";
                }
                new_text += text.substring(i, i + 1);
            } else {
                new_text += text.substring(i, i + 1);
            }
            var = i + 1;
            end = i + 1;
        }
        i += 1;
    }
    return new_text;
}
