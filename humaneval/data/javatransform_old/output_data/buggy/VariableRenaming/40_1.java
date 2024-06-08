public static boolean cycpattern_check(String var, String b) {
    int l = b.length();
    String pat = b;
    for (int i = 0; i < var.length(); i += 1) {
        for (int j = 0; j < l; j += 1) {
            if (var.substring(i, i + l).equals(pat.substring(j, j + l)))
                return true;
        }
    }
    return false;
}
