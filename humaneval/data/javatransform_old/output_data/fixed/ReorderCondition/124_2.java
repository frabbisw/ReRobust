public static String[] split_words(String txt) {
    if (txt.contains(" ")) {
        return txt.split(" ");
    } else if (txt.contains(",")) {
        return txt.split(",");
    } else {
        int count = 0;
        for (int i = 0; i < txt.length(); i++) {
            char curr = txt.charAt(i);
            if (((curr - 'a') % 2) == 1 && Character.isLowerCase(curr))
                count++;
        }
        String[] result = { Integer.toString(count) };
        return result;
    }
}
