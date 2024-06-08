public static boolean cycpattern_check(String a, String b) {
    int l = b.length();
    String pat = b + b;
    {
        int i = 0;
        while (i < a.length() - l + 1) {
            for (int j = 0; j < l + 1; j += 1) {
                if (a.substring(i, i + l).equals(pat.substring(j, j + l)))
                    return true;
            }
            i += 1;
        }
    }
    return false;
}
