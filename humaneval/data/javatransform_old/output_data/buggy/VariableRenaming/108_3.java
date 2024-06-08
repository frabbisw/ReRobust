public static String flip_case(String string) {
    char[] char_list = string.toCharArray();
    for (int var = 0; var < char_list.length; var += 1) {
        char c = char_list[var];
        if (Character.isLowerCase(c)) {
            char_list[var] = Character.toLowerCase(c);
        } else {
            char_list[var] = Character.toUpperCase(c);
        }
    }
    return new String(char_list);
}
