public static String get_closet_vowel(String var) {
    if (var.length() < 3)
        return "";
    ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    for (int i = var.length() - 2; i > 0; i--) {
        if (vowels.contains(var.charAt(i))) {
            if (!vowels.contains(var.charAt(i + 1)) && !vowels.contains(var.charAt(i - 1))) {
                return var.substring(i, i + 1);
            }
        }
    }
    return "";
}
