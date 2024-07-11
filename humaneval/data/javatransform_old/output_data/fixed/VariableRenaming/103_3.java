public static String get_closet_vowel(String word) {
    if (word.length() < 3)
        return "";
    ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    for (int var = word.length() - 2; var > 0; var--) {
        if (vowels.contains(word.charAt(var))) {
            if (!vowels.contains(word.charAt(var + 1)) && !vowels.contains(word.charAt(var - 1))) {
                return word.substring(var, var + 1);
            }
        }
    }
    return "";
}
