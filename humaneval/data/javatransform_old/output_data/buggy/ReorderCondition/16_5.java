public static String encode(String message) {
    StringBuilder sb = new StringBuilder();
    for (char c : message.toCharArray()) {
        if (Character.isUpperCase(c)) {
            c = Character.toLowerCase(c);
        }
        if (Character.isLowerCase(c)) {
            c = Character.toUpperCase(c);
        }
        if (c == 'A' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            c = (char) ((int) c + 2);
        }
        sb.append(c);
    }
    return sb.toString();
}