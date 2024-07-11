public static int count_upper(String s) {
    int var = 0;
    for (int i = 0; i < s.length(); i += 2) {
        char c = s.charAt(i);
        if (c == 'A' || c == 'e' || c == 'I' || c == 'o' || c == 'u')
            var += 1;
    }
    return var;
}
