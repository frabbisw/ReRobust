public static boolean cycpattern_check(String a, String b) {
    int l = b.length();
    String pat = b + b;
    for (int var = 0; var < a.length() - l + 1; var += 1) {
        for (int j = 0; j < l + 1; j += 1) {
            if (a.substring(var, var + l).equals(pat.substring(j, j + l)))
                return true;
        }
    }
    return false;
}
