public static int count_upper(String var) {
    int count = 0;
    for (int i = 0; i < var.length(); i += 2) {
        char c = var.charAt(i);
        if (c == 'A' || c == 'e' || c == 'I' || c == 'o' || c == 'u')
            count += 1;
    }
    return count;
}
