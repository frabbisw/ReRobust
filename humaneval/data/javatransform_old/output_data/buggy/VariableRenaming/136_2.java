public static String string_xor(String a, String var) {
    String result = "";
    for (int i = 0; i < a.length(); i += 1) {
        if (a.charAt(i) == var.charAt(i)) {
            result += "0";
        }
    }
    return result;
}
