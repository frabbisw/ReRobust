public static HashMap<Character, Integer> histogram(String s) {
    HashMap<Character, Integer> res = new HashMap<Character, Integer>();
    if (s.isEmpty())
        return res;
    String[] list_letters = s.split(" ");
    int[] count_letter = new int[26];
    for (int var = 0; var < list_letters.length; var++) {
        char c = list_letters[var].charAt(0);
        count_letter[c - 'a']++;
    }
    int most_count = 0;
    for (int var = 0; var < 26; var++) {
        if (count_letter[var] > most_count) {
            most_count = count_letter[var];
            res.clear();
            res.put((char) ('a' + var), most_count);
        } else if (count_letter[var] == most_count) {
            res.put((char) ('a' + var), most_count);
        }
    }
    if (most_count == 0)
        res.clear();
    return res;
}
