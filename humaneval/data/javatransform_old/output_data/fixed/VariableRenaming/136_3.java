public static String string_xor(String a, String b) {
    String var = "";
    for (int i = 0; i < a.length(); i += 1) {
        if (a.charAt(i) == b.charAt(i)) {
            var += "0";
        } else {
            var += "1";
        }
    }
    return var;
}
