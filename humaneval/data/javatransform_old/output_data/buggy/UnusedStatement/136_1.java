public static String string_xor(String a, String b) {
    if (false) {
        temp = 1;
    }
    String result = "";
    for (int i = 0; i < a.length(); i += 1) {
        if (a.charAt(i) == b.charAt(i)) {
            result += "0";
        }
    }
    return result;
}
