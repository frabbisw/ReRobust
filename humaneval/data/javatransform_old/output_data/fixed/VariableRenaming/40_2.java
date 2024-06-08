public static boolean cycpattern_check(String a, String var) {
    int l = var.length();
    String pat = var + var;
    for (int i = 0; i < a.length() - l + 1; i += 1) {
        for (int j = 0; j < l + 1; j += 1) {
            if (a.substring(i, i + l).equals(pat.substring(j, j + l)))
                return true;
        }
    }
    return false;
}
