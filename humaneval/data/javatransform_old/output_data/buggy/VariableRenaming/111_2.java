public static int vowels_count(String str) {
    int var = 0;
    char[] str_chars = str.toCharArray();
    for (char c : str_chars) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            var += 1;
    }
    if (str_chars[str_chars.length - 1] == 'y')
        var += 1;
    return var;
}
