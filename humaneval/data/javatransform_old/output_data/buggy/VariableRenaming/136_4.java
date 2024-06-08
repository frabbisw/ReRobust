public static String string_xor(String a, String b) {
    String result = "";
    for (int var = 0; var < a.length(); var += 1) {
        if (a.charAt(var) == b.charAt(var)) {
            result += "0";
        }
    }
    return result;
}
