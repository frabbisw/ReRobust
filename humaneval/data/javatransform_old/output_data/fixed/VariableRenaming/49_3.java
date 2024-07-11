public static String remove_vowels(String string) {
    StringBuilder sb = new StringBuilder();
    for (char var : string.toCharArray()) {
        char c_lower = Character.toLowerCase(var);
        if (c_lower == 'a' || c_lower == 'e' || c_lower == 'i' || c_lower == 'o' || c_lower == 'u')
            continue;
        sb.append(var);
    }
    return sb.toString();
}
