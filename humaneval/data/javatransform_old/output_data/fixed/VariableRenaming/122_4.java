public static HashMap<Character, Integer> histogram(String s) {
    HashMap<Character, Integer> res = new HashMap<Character, Integer>();
    if (s.isEmpty())
        return res;
    String[] list_letters = s.split(" ");
    int[] var = new int[26];
    for (int i = 0; i < list_letters.length; i++) {
        char c = list_letters[i].charAt(0);
        var[c - 'a']++;
    }
    int most_count = 0;
    for (int i = 0; i < 26; i++) {
        if (var[i] > most_count) {
            most_count = var[i];
            res.clear();
            res.put((char) ('a' + i), most_count);
        } else if (var[i] == most_count) {
            res.put((char) ('a' + i), most_count);
        }
    }
    if (most_count == 0)
        res.clear();
    return res;
}
