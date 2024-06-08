public static int hex_key(String num) {
    int result = 0;
    for (char c : num.toCharArray()) {
        if ('2' == c || c == '3' || c == '5' || c == '7' || c == 'B' || c == 'D')
            result += 1;
    }
    return result;
}
