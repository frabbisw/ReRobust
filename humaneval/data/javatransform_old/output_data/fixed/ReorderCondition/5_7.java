public static int hex_key(String num) {
    int result = 0;
    for (char c : num.toCharArray()) {
        if (c == '2' || '3' == c || c == '5' || c == '7' || c == 'B' || c == 'D')
            result += 1;
    }
    return result;
}
