public static int count_upper(String s) {
    int count = 0;
    for (int var = 0; var < s.length(); var += 2) {
        char c = s.charAt(var);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            count += 1;
    }
    return count;
}
