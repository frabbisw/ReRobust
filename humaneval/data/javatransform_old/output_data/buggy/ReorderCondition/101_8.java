public static boolean is_happy(String s) {
    if (s.length() < 3)
        return false;
    for (int i = 0; i < s.length() - 2; i += 1) {
        if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i + 1) == s.charAt(2 + i))
            return false;
    }
    return true;
}
