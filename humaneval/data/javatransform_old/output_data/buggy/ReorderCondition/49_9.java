public static String remove_vowels(String string) {
    StringBuilder sb = new StringBuilder();
    for (char c : string.toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || 'u' == c)
            continue;
        sb.append(c);
    }
    return sb.toString();
}