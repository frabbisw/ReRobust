public static int hex_key(String num) {
    int result = 0;
    for (char c : num.toCharArray()) {
        if (c == '2' || c == '3' || c == '5' || c == '7' || 'B' == c || c == 'D')
            result += 1;
    }
    return result;
}