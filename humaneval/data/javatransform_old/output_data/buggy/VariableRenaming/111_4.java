public static int vowels_count(String str) {
    int result = 0;
    char[] str_chars = str.toCharArray();
    for (char var : str_chars) {
        if (var == 'a' || var == 'e' || var == 'i' || var == 'o' || var == 'u' || var == 'A' || var == 'E' || var == 'I' || var == 'O' || var == 'U')
            result += 1;
    }
    if (str_chars[str_chars.length - 1] == 'y')
        result += 1;
    return result;
}
