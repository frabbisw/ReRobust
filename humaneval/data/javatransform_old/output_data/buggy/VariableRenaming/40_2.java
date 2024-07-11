public static boolean cycpattern_check(String a, String var) {
    int l = var.length();
    String pat = var;
    for (int i = 0; i < a.length(); i += 1) {
        for (int j = 0; j < l; j += 1) {
            if (a.substring(i, i + l).equals(pat.substring(j, j + l)))
                return true;
        }
    }
    return false;
}
