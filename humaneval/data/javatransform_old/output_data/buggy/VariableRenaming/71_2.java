public static String encode_shift(String string) {
    StringBuilder var = new StringBuilder();
    for (char c : string.toCharArray()) {
        c = (char) ((((int) c + 5 - (int) ('a')) % 26) + (int) ('a'));
        var.append(c);
    }
    return var.toString();
}
