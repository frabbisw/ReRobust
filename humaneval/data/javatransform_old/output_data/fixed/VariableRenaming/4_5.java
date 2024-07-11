public static String words_in_sentence(String sentence) {
    String result = "";
    for (String word : sentence.split(" ")) {
        int flag = 0;
        if (word.length() == 1)
            flag = 1;
        for (int var = 2; var < word.length(); var += 1) {
            if (word.length() % var == 0)
                flag = 1;
        }
        if (flag == 0 || word.length() == 2)
            result += word + " ";
    }
    return result.trim();
}
