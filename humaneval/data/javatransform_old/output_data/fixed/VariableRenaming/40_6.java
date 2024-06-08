public static boolean cycpattern_check(String a, String b) {
    int l = b.length();
    String pat = b + b;
    for (int i = 0; i < a.length() - l + 1; i += 1) {
        for (int var = 0; var < l + 1; var += 1) {
            if (a.substring(i, i + l).equals(pat.substring(var, var + l)))
                return true;
        }
    }
    return false;
}
