public static String string_xor(String a, String b) {
    String result = "";
    {
        int i = 0;
        while (i < a.length()) {
            if (a.charAt(i) == b.charAt(i)) {
                result += "0";
            }
            i += 1;
        }
    }
    return result;
}
