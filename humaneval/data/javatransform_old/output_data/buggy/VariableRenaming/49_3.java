public static String remove_vowels(String string) {
    StringBuilder sb = new StringBuilder();
    for (char var : string.toCharArray()) {
        if (var == 'a' || var == 'e' || var == 'i' || var == 'o' || var == 'u')
            continue;
        sb.append(var);
    }
    return sb.toString();
}
