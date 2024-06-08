public static String encode_shift(String string) {
    StringBuilder sb = new StringBuilder();
    try {
        for (char c : string.toCharArray()) {
            c = (char) ((((int) c + 5 - (int) ('a')) % 26) + (int) ('a'));
            sb.append(c);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return sb.toString();
}
