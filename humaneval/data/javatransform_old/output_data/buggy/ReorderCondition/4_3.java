public static String words_in_sentence(String sentence) {
    String result = "";
    for (String word : sentence.split(" ")) {
        int flag = 0;
        for (int i = 2; i < word.length(); i += 1) {
            if (word.length() % i == 0)
                flag = 1;
        }
        if (word.length() == 2 || flag == 0)
            result += word + " ";
    }
    return result.trim();
}
