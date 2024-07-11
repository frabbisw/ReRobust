public static boolean cycpattern_check(String a, String b) {
    int l = b.length();
    String pat = b + b;
    for (int i = 0; i < a.length() - l + 1; i += 1) {
        for (int j = 0; j < l + 1; j += 1) {
            if (a.substring(i, l + i).equals(pat.substring(j, j + l)))
                return true;
        }
    }
    return false;
}
