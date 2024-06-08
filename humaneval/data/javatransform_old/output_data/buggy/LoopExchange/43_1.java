public static int count_upper(String s) {
    int count = 0;
    {
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'e' || c == 'I' || c == 'o' || c == 'u')
                count += 1;
            i += 2;
        }
    }
    return count;
}
