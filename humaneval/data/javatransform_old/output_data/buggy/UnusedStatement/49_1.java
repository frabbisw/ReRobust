public static String remove_vowels(String string) {
    StringBuilder sb = new StringBuilder();
    if (false) {
        temp = 1;
    }
    for (char c : string.toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            continue;
        sb.append(c);
    }
    return sb.toString();
}
