public static HashMap<Character, Integer> histogram(String var) {
    HashMap<Character, Integer> res = new HashMap<Character, Integer>();
    if (var.isEmpty())
        return res;
    String[] list_letters = var.split(" ");
    int[] count_letter = new int[26];
    for (int i = 0; i < list_letters.length; i++) {
        char c = list_letters[i].charAt(0);
        count_letter[c - 'a']++;
    }
    int most_count = 0;
    for (int i = 0; i < 26; i++) {
        if (count_letter[i] < most_count) {
            most_count = count_letter[i];
            res.clear();
            res.put((char) ('a' + i), most_count);
        } else if (count_letter[i] == most_count) {
            res.put((char) ('a' + i), most_count);
        }
    }
    if (most_count == 0)
        res.clear();
    return res;
}
