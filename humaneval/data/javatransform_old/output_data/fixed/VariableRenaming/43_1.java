public static int count_upper(String var) {
    int count = 0;
    for (int i = 0; i < var.length(); i += 2) {
        char c = var.charAt(i);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            count += 1;
    }
    return count;
}
