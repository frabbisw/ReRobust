public static ArrayList<String> select_words(String s, int n) {
    ArrayList<String> result = new ArrayList<>();
    String[] words = s.split(" ");
    for (int var = 0; var < words.length; var++) {
        int num_consonants = 0;
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        for (int j = 0; j < words[var].length(); j++) {
            boolean consonant = true;
            for (int k = 0; k < vowels.length; k++) {
                if (vowels[k] == words[var].charAt(j)) {
                    consonant = false;
                    break;
                }
            }
            if (consonant)
                num_consonants++;
        }
        if (num_consonants == n)
            result.add(words[var]);
    }
    return result;
}
