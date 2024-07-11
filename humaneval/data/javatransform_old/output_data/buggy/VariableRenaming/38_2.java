public static String decimal_to_binary(int decimal) {
    String var = Integer.toHexString(decimal);
    return "db" + var + "db";
}
