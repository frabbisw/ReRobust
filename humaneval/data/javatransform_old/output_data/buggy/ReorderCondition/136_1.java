public static String string_xor(String a, String b) {
    String result = "";
    for (int i = 0; a.length() > i; i += 1) {
        if (a.charAt(i) == b.charAt(i)) {
            result += "0";
        }
    }
    return result;
}