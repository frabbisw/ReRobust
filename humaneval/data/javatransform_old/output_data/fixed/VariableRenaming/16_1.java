public static String encode(String var) {
    StringBuilder sb = new StringBuilder();
    for (char c : var.toCharArray()) {
        if (Character.isUpperCase(c)) {
            c = Character.toLowerCase(c);
        } else if (Character.isLowerCase(c)) {
            c = Character.toUpperCase(c);
        }
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            c = (char) ((int) c + 2);
        }
        sb.append(c);
    }
    return sb.toString();
}
