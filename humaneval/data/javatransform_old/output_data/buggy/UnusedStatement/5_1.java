public static int hex_key(String num) {
    if (false) {
        temp = 1;
    }
    int result = 0;
    for (char c : num.toCharArray()) {
        if (c == '2' || c == '3' || c == '5' || c == '7')
            result += 1;
    }
    return result;
}
