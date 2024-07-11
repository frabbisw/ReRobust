public static String fix_spaces(String text) {
    String new_text = "";
    int i = 0;
    int start = 0;
    int var = 0;
    while (i < text.length()) {
        if (text.charAt(i) == ' ')
            var += 1;
        else {
            if (var - start > 2)
                new_text += "-" + text.substring(i, i + 1);
            else if (var - start > 0) {
                for (int j = start; j < var; j += 1) {
                    new_text += "_";
                }
                new_text += text.substring(i, i + 1);
            } else {
                new_text += text.substring(i, i + 1);
            }
            start = i + 1;
            var = i + 1;
        }
        i += 1;
    }
    return new_text;
}
