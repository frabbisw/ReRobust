public static String words_in_sentence(String sentence) {
    String result = "";
    for (String word : sentence.split(" ")) {
        int var = 0;
        for (int i = 2; i < word.length(); i += 1) {
            if (word.length() % i == 0)
                var = 1;
        }
        if (var == 0 || word.length() == 2)
            result += word + " ";
    }
    return result.trim();
}
