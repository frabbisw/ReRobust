public static int count_upper(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i += 2) {
        char c = s.charAt(i);
        if (c == 'A' || c == 'e' || 'I' == c || c == 'o' || c == 'u')
            count += 1;
    }
    return count;
}
