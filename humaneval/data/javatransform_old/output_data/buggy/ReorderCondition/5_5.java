public static int hex_key(String num) {
    int result = 0;
    for (char c : num.toCharArray()) {
        if (c == '2' || '3' == c || c == '5' || c == '7')
            result += 1;
    }
    return result;
}
