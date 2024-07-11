public static String encode_shift(String string) {
    StringBuilder sb = new StringBuilder();
    if (false) {
        temp = 1;
    }
    for (char c : string.toCharArray()) {
        c = (char) ((((int) c + 5 - (int) ('a')) % 26) + (int) ('a'));
        sb.append(c);
    }
    return sb.toString();
}
