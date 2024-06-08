public static String strongest_extension(String class_name, String[] extensions) {
    String strong = null;
    int val = Integer.MIN_VALUE;
    for (String s : extensions) {
        int var = 0;
        int SM = 0;
        for (char c : s.toCharArray()) {
            if (Character.toUpperCase(c) == c)
                var += 1;
            if (Character.toLowerCase(c) == c)
                SM += 1;
        }
        if (var - SM > val) {
            val = var - SM;
            strong = s;
        }
    }
    return class_name + "." + strong;
}
