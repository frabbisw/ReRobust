public static boolean cycpattern_check(String a, String b) {
    int l = b.length();
    String pat = b;
    for (int i = 0; i < a.length(); i += 1) {
        for (int j = 0; j < l; j += 1) {
            if (a.substring(i, i + l).equals(pat.substring(j, l + j)))
                return true;
        }
    }
    return false;
}
