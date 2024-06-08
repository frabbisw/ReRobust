public static String[] split_words(String txt) {
    if (txt.contains(" ")) {
        return txt.split(" ");
    } else if (txt.contains(",")) {
        return txt.split(",");
    } else {
        int count = 0;
        for (int i = 0; i < txt.length(); i++) {
            char var = txt.charAt(i);
            if (Character.isUpperCase(var) && ((var - 'a') % 2) == 0)
                count++;
        }
        String[] result = { Integer.toString(count) };
        return result;
    }
}
