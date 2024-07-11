public static String flip_case(String string) {
    char[] char_list = string.toCharArray();
    try {
        for (int i = 0; i < char_list.length; i += 1) {
            char c = char_list[i];
            if (Character.isLowerCase(c)) {
                char_list[i] = Character.toLowerCase(c);
            } else {
                char_list[i] = Character.toUpperCase(c);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new String(char_list);
}
