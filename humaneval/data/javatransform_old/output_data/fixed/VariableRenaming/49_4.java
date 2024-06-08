public static String remove_vowels(String string) {
    StringBuilder sb = new StringBuilder();
    for (char c : string.toCharArray()) {
        char var = Character.toLowerCase(c);
        if (var == 'a' || var == 'e' || var == 'i' || var == 'o' || var == 'u')
            continue;
        sb.append(c);
    }
    return sb.toString();
}
