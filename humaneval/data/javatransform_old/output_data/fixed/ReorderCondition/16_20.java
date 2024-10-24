public static String encode(String message) {
    StringBuilder sb = new StringBuilder();
    for (char c : message.toCharArray()) {
        if (Character.isUpperCase(c)) {
            c = Character.toLowerCase(c);
        } else if (Character.isLowerCase(c)) {
            c = Character.toUpperCase(c);
        }
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            c = (char) (2 + (int) c);
        }
        sb.append(c);
    }
    return sb.toString();
}