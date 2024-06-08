public static String encode_shift(String var) {
    StringBuilder sb = new StringBuilder();
    for (char c : var.toCharArray()) {
        c = (char) ((((int) c + 5 - (int) ('a')) % 26) + (int) ('a'));
        sb.append(c);
    }
    return sb.toString();
}
