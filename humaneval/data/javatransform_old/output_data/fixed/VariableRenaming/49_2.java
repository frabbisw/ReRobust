public static String remove_vowels(String string) {
    StringBuilder var = new StringBuilder();
    for (char c : string.toCharArray()) {
        char c_lower = Character.toLowerCase(c);
        if (c_lower == 'a' || c_lower == 'e' || c_lower == 'i' || c_lower == 'o' || c_lower == 'u')
            continue;
        var.append(c);
    }
    return var.toString();
}
