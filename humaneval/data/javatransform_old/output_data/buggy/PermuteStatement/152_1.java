public static String strongest_extension(String class_name, String[] extensions) {
    int val = Integer.MIN_VALUE;
    String strong = null;
    for (String s : extensions) {
        int CAP = 0;
        int SM = 0;
        for (char c : s.toCharArray()) {
            if (Character.toUpperCase(c) == c)
                SM += 1;
            if (Character.toLowerCase(c) == c)
                CAP += 1;
        }
        val = CAP - SM;
        strong = s;
    }
    return class_name + "." + strong;
}
