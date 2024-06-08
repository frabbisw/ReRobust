public static String string_xor(String a, String b) {
    String result = "";
    try {
        for (int i = 0; i < a.length(); i += 1) {
            if (a.charAt(i) == b.charAt(i)) {
                result += "0";
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
