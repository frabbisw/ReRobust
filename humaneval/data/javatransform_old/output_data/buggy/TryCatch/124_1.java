public static String[] split_words(String txt) {
    try {
        if (txt.contains(" ")) {
            return txt.split(" ");
        } else if (txt.contains(",")) {
            return txt.split(",");
        } else {
            int count = 0;
            for (int i = 0; i < txt.length(); i++) {
                char curr = txt.charAt(i);
                if (Character.isUpperCase(curr) && ((curr - 'a') % 2) == 0)
                    count++;
            }
            String[] result = { Integer.toString(count) };
            return result;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}