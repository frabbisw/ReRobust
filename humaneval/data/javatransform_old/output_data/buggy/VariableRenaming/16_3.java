public static String encode(String message) {
    StringBuilder sb = new StringBuilder();
    for (char var : message.toCharArray()) {
        if (Character.isUpperCase(var)) {
            var = Character.toLowerCase(var);
        }
        if (Character.isLowerCase(var)) {
            var = Character.toUpperCase(var);
        }
        if (var == 'a' || var == 'e' || var == 'i' || var == 'o' || var == 'u' || var == 'A' || var == 'E' || var == 'I' || var == 'O' || var == 'U') {
            var = (char) ((int) var + 2);
        }
        sb.append(var);
    }
    return sb.toString();
}
