public static int vowels_count(String str) {
    int result = 0;
    char[] var = str.toCharArray();
    for (char c : var) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            result += 1;
    }
    if (var[var.length - 1] == 'y')
        result += 1;
    return result;
}
