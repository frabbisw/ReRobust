public static boolean is_happy(String s) {
    if (3 > s.length())
        return false;
    for (int i = 0; i < s.length() - 2; i += 1) {
        if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i + 1) == s.charAt(i + 2))
            return false;
    }
    return true;
}
