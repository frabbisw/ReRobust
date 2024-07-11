public static String encode(String message) {
    StringBuilder sb = new StringBuilder();
    for (char c : message.toCharArray()) {
        if (Character.isUpperCase(c)) {
            c = Character.toLowerCase(c);
        }
        if (Character.isLowerCase(c)) {
            c = Character.toUpperCase(c);
        }
        if (c == 'a' || c == 'e' || 'i' == c || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            c = (char) ((int) c + 2);
        }
        sb.append(c);
    }
    return sb.toString();
}
