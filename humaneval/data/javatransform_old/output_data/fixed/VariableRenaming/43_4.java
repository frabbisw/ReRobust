public static int count_upper(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i += 2) {
        char var = s.charAt(i);
        if (var == 'A' || var == 'E' || var == 'I' || var == 'O' || var == 'U')
            count += 1;
    }
    return count;
}
