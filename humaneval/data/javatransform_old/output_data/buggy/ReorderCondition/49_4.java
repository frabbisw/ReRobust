public static String remove_vowels(String string) {
    StringBuilder sb = new StringBuilder();
    for (char c : string.toCharArray()) {
        if (c == 'e' || c == 'a' || c == 'i' || c == 'o' || c == 'u')
            continue;
        sb.append(c);
    }
    return sb.toString();
}
