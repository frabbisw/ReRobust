public static int count_upper(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i += 2) {
        char var = s.charAt(i);
        if (var == 'A' || var == 'e' || var == 'I' || var == 'o' || var == 'u')
            count += 1;
    }
    return count;
}
