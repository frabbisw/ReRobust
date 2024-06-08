public static HashMap<Character, Integer> histogram(String s) {
    HashMap<Character, Integer> var = new HashMap<Character, Integer>();
    if (s.isEmpty())
        return var;
    String[] list_letters = s.split(" ");
    int[] count_letter = new int[26];
    for (int i = 0; i < list_letters.length; i++) {
        char c = list_letters[i].charAt(0);
        count_letter[c - 'a']++;
    }
    int most_count = 0;
    for (int i = 0; i < 26; i++) {
        if (count_letter[i] > most_count) {
            most_count = count_letter[i];
            var.clear();
            var.put((char) ('a' + i), most_count);
        } else if (count_letter[i] == most_count) {
            var.put((char) ('a' + i), most_count);
        }
    }
    if (most_count == 0)
        var.clear();
    return var;
}
