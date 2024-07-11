public static String words_in_sentence(String sentence) {
    String result = "";
    try {
        for (String word : sentence.split(" ")) {
            int flag = 0;
            for (int i = 2; i < word.length(); i += 1) {
                if (word.length() % i == 0)
                    flag = 1;
            }
            if (flag == 0 || word.length() == 2)
                result += word + " ";
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result.trim();
}
