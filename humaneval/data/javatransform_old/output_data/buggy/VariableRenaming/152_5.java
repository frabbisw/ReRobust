public static String strongest_extension(String class_name, String[] extensions) {
    String strong = null;
    int val = Integer.MIN_VALUE;
    for (String var : extensions) {
        int CAP = 0;
        int SM = 0;
        for (char c : var.toCharArray()) {
            if (Character.toUpperCase(c) == c)
                SM += 1;
            if (Character.toLowerCase(c) == c)
                CAP += 1;
        }
        val = CAP - SM;
        strong = var;
    }
    return class_name + "." + strong;
}
