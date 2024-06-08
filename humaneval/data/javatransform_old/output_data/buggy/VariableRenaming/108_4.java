public static String flip_case(String string) {
    char[] char_list = string.toCharArray();
    for (int i = 0; i < char_list.length; i += 1) {
        char var = char_list[i];
        if (Character.isLowerCase(var)) {
            char_list[i] = Character.toLowerCase(var);
        } else {
            char_list[i] = Character.toUpperCase(var);
        }
    }
    return new String(char_list);
}
