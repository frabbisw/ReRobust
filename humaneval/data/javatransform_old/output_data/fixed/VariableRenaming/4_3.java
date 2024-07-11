public static String words_in_sentence(String sentence) {
    String result = "";
    for (String var : sentence.split(" ")) {
        int flag = 0;
        if (var.length() == 1)
            flag = 1;
        for (int i = 2; i < var.length(); i += 1) {
            if (var.length() % i == 0)
                flag = 1;
        }
        if (flag == 0 || var.length() == 2)
            result += var + " ";
    }
    return result.trim();
}
