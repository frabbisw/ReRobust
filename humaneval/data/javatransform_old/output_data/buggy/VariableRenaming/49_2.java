public static String remove_vowels(String string) {
    StringBuilder var = new StringBuilder();
    for (char c : string.toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            continue;
        var.append(c);
    }
    return var.toString();
}
