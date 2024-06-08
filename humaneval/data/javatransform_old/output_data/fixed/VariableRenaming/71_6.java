public static String encode_shift(String string) {
    StringBuilder sb = new StringBuilder();
    for (char var : string.toCharArray()) {
        var = (char) ((((int) var + 5 - (int) ('a')) % 26) + (int) ('a'));
        sb.append(var);
    }
    return sb.toString();
}
