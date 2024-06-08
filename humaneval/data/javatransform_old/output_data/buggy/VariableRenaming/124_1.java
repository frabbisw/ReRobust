public static String[] split_words(String var) {
    if (var.contains(" ")) {
        return var.split(" ");
    } else if (var.contains(",")) {
        return var.split(",");
    } else {
        int count = 0;
        for (int i = 0; i < var.length(); i++) {
            char curr = var.charAt(i);
            if (Character.isUpperCase(curr) && ((curr - 'a') % 2) == 0)
                count++;
        }
        String[] result = { Integer.toString(count) };
        return result;
    }
}
