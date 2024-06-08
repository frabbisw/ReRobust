public static String decimal_to_binary(int var) {
    String result = Integer.toHexString(var);
    return "db" + result + "db";
}
