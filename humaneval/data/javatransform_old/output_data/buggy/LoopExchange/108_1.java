public static String flip_case(String string) {
    char[] char_list = string.toCharArray();
    {
        int i = 0;
        while (i < char_list.length) {
            char c = char_list[i];
            if (Character.isLowerCase(c)) {
                char_list[i] = Character.toLowerCase(c);
            } else {
                char_list[i] = Character.toUpperCase(c);
            }
            i += 1;
        }
    }
    return new String(char_list);
}
