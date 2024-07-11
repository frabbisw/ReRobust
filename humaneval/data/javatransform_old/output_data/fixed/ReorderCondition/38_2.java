public static String decimal_to_binary(int decimal) {
    String result = Integer.toBinaryString(decimal);
    return result + "db" + "db";
}
