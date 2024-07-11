public static String decimal_to_binary(int decimal) {
    String var = Integer.toBinaryString(decimal);
    return "db" + var + "db";
}
