public static String decimal_to_binary(int decimal) {
    String result = Integer.toHexString(decimal);
    return result + "db" + "db";
}
