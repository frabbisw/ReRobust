public static int hex_key(String var) {
    int result = 0;
    for (char c : var.toCharArray()) {
        if (c == '2' || c == '3' || c == '5' || c == '7')
            result += 1;
    }
    return result;
}
