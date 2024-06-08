public static boolean is_happy(String s) {
    if (s.length() < 3)
        return false;
    for (int var = 0; var < s.length() - 2; var += 1) {
        if (s.charAt(var) == s.charAt(var + 1) || s.charAt(var + 1) == s.charAt(var + 2))
            return false;
    }
    return true;
}
