public static String fix_spaces(String text) {
    String new_text = "";
    int var = 0;
    int start = 0;
    int end = 0;
    while (var < text.length()) {
        if (text.charAt(var) == ' ')
            end += 1;
        else {
            if (end - start > 2)
                new_text += "-" + text.substring(var, var + 1);
            else if (end - start > 0) {
                for (int j = start; j < end; j += 1) {
                    new_text += "_";
                }
                new_text += text.substring(var, var + 1);
            } else {
                new_text += text.substring(var, var + 1);
            }
            start = var + 1;
            end = var + 1;
        }
        var += 1;
    }
    if (end - start > 2)
        new_text += "-";
    else if (end - start > 0) {
        for (int j = start; j < end; j += 1) {
            new_text += "_";
        }
    }
    return new_text;
}
