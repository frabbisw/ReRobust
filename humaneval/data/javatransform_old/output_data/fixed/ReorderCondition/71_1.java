public static String encode_shift(String string) {
    StringBuilder sb = new StringBuilder();
    for (char c : string.toCharArray()) {
        c = (char) ((int) ('a') + (((int) c + 5 - (int) ('a')) % 26));
        sb.append(c);
    }
    return sb.toString();
}
