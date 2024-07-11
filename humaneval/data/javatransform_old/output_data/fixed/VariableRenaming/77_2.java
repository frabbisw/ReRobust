public static String fix_spaces(String text) {
    String var = "";
    int i = 0;
    int start = 0;
    int end = 0;
    while (i < text.length()) {
        if (text.charAt(i) == ' ')
            end += 1;
        else {
            if (end - start > 2)
                var += "-" + text.substring(i, i + 1);
            else if (end - start > 0) {
                for (int j = start; j < end; j += 1) {
                    var += "_";
                }
                var += text.substring(i, i + 1);
            } else {
                var += text.substring(i, i + 1);
            }
            start = i + 1;
            end = i + 1;
        }
        i += 1;
    }
    if (end - start > 2)
        var += "-";
    else if (end - start > 0) {
        for (int j = start; j < end; j += 1) {
            var += "_";
        }
    }
    return var;
}
