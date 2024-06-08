public static String encode_shift(String string) {
    StringBuilder sb = new StringBuilder();
    for (char c : string.toCharArray()) {
        c = (char) (((5 + (int) c - (int) ('a')) % 26) + (int) ('a'));
        sb.append(c);
    }
    return sb.toString();
}
