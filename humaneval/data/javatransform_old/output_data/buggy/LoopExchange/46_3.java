public static ArrayList<String> select_words(String s, int n) {
    ArrayList<String> result = new ArrayList<>();
    String[] words = s.split(" ");
    for (int i = 0; i < words.length; i++) {
        int num_consonants = 0;
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (int j = 0; j < words[i].length(); j++) {
            boolean consonant = true;
            {
                int k = 0;
                while (k < vowels.length) {
                    if (vowels[k] == words[i].charAt(j)) {
                        consonant = false;
                        break;
                    }
                    k++;
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
