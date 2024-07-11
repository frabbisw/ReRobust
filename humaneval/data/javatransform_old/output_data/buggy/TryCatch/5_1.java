public static int hex_key(String num) {
    int result = 0;
    try {
        for (char c : num.toCharArray()) {
            if (c == '2' || c == '3' || c == '5' || c == '7')
                result += 1;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
