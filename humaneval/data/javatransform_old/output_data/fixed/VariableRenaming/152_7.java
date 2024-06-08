public static String strongest_extension(String class_name, String[] extensions) {
    String strong = null;
    int val = Integer.MIN_VALUE;
    for (String s : extensions) {
        int CAP = 0;
        int var = 0;
        for (char c : s.toCharArray()) {
            if (Character.toUpperCase(c) == c)
                CAP += 1;
            if (Character.toLowerCase(c) == c)
                var += 1;
        }
        if (CAP - var > val) {
            val = CAP - var;
            strong = s;
        }
    }
    return class_name + "." + strong;
}
