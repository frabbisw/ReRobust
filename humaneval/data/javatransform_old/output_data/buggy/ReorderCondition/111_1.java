public static int vowels_count(String str) {
    int result = 0;
    char[] str_chars = str.toCharArray();
    for (char c : str_chars) {
        if (c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O')
            result += 1;
    }
    if (str_chars[str_chars.length - 1] == 'y')
        result += 1;
    return result;
}
