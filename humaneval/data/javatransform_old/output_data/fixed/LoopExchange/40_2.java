public static boolean cycpattern_check(String a, String b) {
    int l = b.length();
    String pat = b + b;
    for (int i = 0; i < a.length() - l + 1; i += 1) {
        {
            int j = 0;
            while (j < l + 1) {
                if (a.substring(i, i + l).equals(pat.substring(j, j + l)))
                    return true;
                j += 1;
            }
        }
    }
    return false;
}
