public static String decimal_to_binary(int var) {
    String result = Integer.toBinaryString(var);
    return "db" + result + "db";
}
