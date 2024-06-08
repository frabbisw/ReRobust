public static String string_xor(String var, String b) {
    String result = "";
    for (int i = 0; i < var.length(); i += 1) {
        if (var.charAt(i) == b.charAt(i)) {
            result += "0";
        } else {
            result += "1";
        }
    }
    return result;
}
