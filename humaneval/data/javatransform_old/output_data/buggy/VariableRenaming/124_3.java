public static String[] split_words(String txt) {
    if (txt.contains(" ")) {
        return txt.split(" ");
    } else if (txt.contains(",")) {
        return txt.split(",");
    } else {
        int count = 0;
        for (int var = 0; var < txt.length(); var++) {
            char curr = txt.charAt(var);
            if (Character.isUpperCase(curr) && ((curr - 'a') % 2) == 0)
                count++;
        }
        String[] result = { Integer.toString(count) };
        return result;
    }
}