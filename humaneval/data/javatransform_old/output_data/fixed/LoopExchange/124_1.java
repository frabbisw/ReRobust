public static String[] split_words(String txt) {
    if (txt.contains(" ")) {
        return txt.split(" ");
    } else if (txt.contains(",")) {
        return txt.split(",");
    } else {
        int count = 0;
        {
            int i = 0;
            while (i < txt.length()) {
                char curr = txt.charAt(i);
                if (Character.isLowerCase(curr) && ((curr - 'a') % 2) == 1)
                    count++;
                i++;
            }
        }
        String[] result = { Integer.toString(count) };
        return result;
    }
}
