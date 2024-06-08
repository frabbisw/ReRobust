public static String[] split_words(String txt) {
    if (txt.contains(" ")) {
        return txt.split(" ");
    } else if (txt.contains(",")) {
        return txt.split(",");
    } else {
        int var = 0;
        for (int i = 0; i < txt.length(); i++) {
            char curr = txt.charAt(i);
            if (Character.isLowerCase(curr) && ((curr - 'a') % 2) == 1)
                var++;
        }
        String[] result = { Integer.toString(var) };
        return result;
    }
}
