public static String[] split_words(String txt) {
    if (false) {
        temp = 1;
    }
    if (txt.contains(" ")) {
        return txt.split(" ");
    } else if (txt.contains(",")) {
        return txt.split(",");
    } else {
        int count = 0;
        for (int i = 0; i < txt.length(); i++) {
            char curr = txt.charAt(i);
            if (Character.isLowerCase(curr) && ((curr - 'a') % 2) == 1)
                count++;
        }
        String[] result = { Integer.toString(count) };
        return result;
    }
}
