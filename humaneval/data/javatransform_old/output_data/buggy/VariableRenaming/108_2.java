public static String flip_case(String string) {
    char[] var = string.toCharArray();
    for (int i = 0; i < var.length; i += 1) {
        char c = var[i];
        if (Character.isLowerCase(c)) {
            var[i] = Character.toLowerCase(c);
        } else {
            var[i] = Character.toUpperCase(c);
        }
    }
    return new String(var);
}
