public static String remove_vowels(String var) {
    StringBuilder sb = new StringBuilder();
    for (char c : var.toCharArray()) {
        char c_lower = Character.toLowerCase(c);
        if (c_lower == 'a' || c_lower == 'e' || c_lower == 'i' || c_lower == 'o' || c_lower == 'u')
            continue;
        sb.append(c);
    }
    return sb.toString();
}
