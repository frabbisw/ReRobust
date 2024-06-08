public static String flip_case(String string) {
    char[] char_list = string.toCharArray();
    for (int i = 0; char_list.length > i; i += 1) {
        char c = char_list[i];
        if (Character.isLowerCase(c)) {
            char_list[i] = Character.toUpperCase(c);
        } else {
            char_list[i] = Character.toLowerCase(c);
        }
    }
    return new String(char_list);
}
