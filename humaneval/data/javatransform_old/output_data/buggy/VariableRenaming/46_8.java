public static ArrayList<String> select_words(String s, int n) {
    ArrayList<String> result = new ArrayList<>();
    String[] words = s.split(" ");
    for (int i = 0; i < words.length; i++) {
        int num_consonants = 0;
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (int var = 0; var < words[i].length(); var++) {
            boolean consonant = true;
            for (int k = 0; k < vowels.length; k++) {
                if (vowels[k] == words[i].charAt(var)) {
                    consonant = false;
                    break;
                }
            }
            if (consonant)
                num_consonants++;
        }
        if (num_consonants == n)
            result.add(words[i]);
    }
    return result;
}
