public static int hex_key(String num) {
    int result = 0;
    for (char var : num.toCharArray()) {
        if (var == '2' || var == '3' || var == '5' || var == '7' || var == 'B' || var == 'D')
            result += 1;
    }
    return result;
}
