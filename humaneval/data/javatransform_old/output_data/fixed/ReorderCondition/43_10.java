public static int count_upper(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i += 2) {
        char c = s.charAt(i);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || 'U' == c)
            count += 1;
    }
    return count;
}
