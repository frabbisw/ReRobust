public static String remove_vowels(String string) {
    StringBuilder sb = new StringBuilder();
    for (char c : string.toCharArray()) {
        char c_lower = Character.toLowerCase(c);
        if (c_lower == 'a' || c_lower == 'e' || c_lower == 'i' || c_lower == 'o' || 'u' == c_lower)
            continue;
        sb.append(c);
    }
    return sb.toString();
}
