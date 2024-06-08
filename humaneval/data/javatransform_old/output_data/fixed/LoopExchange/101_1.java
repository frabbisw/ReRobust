public static boolean is_happy(String s) {
    if (s.length() < 3)
        return false;
    {
        int i = 0;
        while (i < s.length() - 2) {
            if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i + 1) == s.charAt(i + 2) || s.charAt(i + 2) == s.charAt(i))
                return false;
            i += 1;
        }
    }
    return true;
}
