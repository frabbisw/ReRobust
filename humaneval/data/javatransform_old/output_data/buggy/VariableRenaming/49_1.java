public static String remove_vowels(String var) {
    StringBuilder sb = new StringBuilder();
    for (char c : var.toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            continue;
        sb.append(c);
    }
    return sb.toString();
}
