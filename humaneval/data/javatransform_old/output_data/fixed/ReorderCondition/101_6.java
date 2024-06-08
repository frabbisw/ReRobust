public static boolean is_happy(String s) {
    if (s.length() < 3)
        return false;
    for (int i = 0; i < s.length() - 2; i += 1) {
        if (s.charAt(i) == s.charAt(1 + i) || s.charAt(1 + i) == s.charAt(i + 2) || s.charAt(i + 2) == s.charAt(i))
            return false;
    }
    return true;
}
