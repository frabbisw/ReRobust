public static String string_xor(String a, String b) {
    String result = "";
    for (int i = 0; i < a.length(); i += 1) {
        if (b.charAt(i) == a.charAt(i)) {
            result += "0";
        } else {
            result += "1";
        }
    }
    return result;
}
