public static String strongest_extension(String class_name, String[] extensions) {
    String strong = null;
    int val = Integer.MIN_VALUE;
    for (String s : extensions) {
        int CAP = 0;
        int SM = 0;
        for (char var : s.toCharArray()) {
            if (Character.toUpperCase(var) == var)
                CAP += 1;
            if (Character.toLowerCase(var) == var)
                SM += 1;
        }
        if (CAP - SM > val) {
            val = CAP - SM;
            strong = s;
        }
    }
    return class_name + "." + strong;
}
