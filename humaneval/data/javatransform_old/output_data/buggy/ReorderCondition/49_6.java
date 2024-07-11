public static String remove_vowels(String string) {
    StringBuilder sb = new StringBuilder();
    for (char c : string.toCharArray()) {
        if (c == 'a' || 'e' == c || c == 'i' || c == 'o' || c == 'u')
            continue;
        sb.append(c);
    }
    return sb.toString();
}
