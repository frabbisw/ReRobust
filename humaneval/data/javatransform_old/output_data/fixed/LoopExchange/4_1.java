public static String words_in_sentence(String sentence) {
    String result = "";
    for (String word : sentence.split(" ")) {
        int flag = 0;
        if (word.length() == 1)
            flag = 1;
        {
            int i = 2;
            while (i < word.length()) {
                if (word.length() % i == 0)
                    flag = 1;
                i += 1;
            }
        }
        if (flag == 0 || word.length() == 2)
            result += word + " ";
    }
    return result.trim();
}