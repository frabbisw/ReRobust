public static boolean cycpattern_check(String a, String b) {
    int var = b.length();
    String pat = b;
    for (int i = 0; i < a.length(); i += 1) {
        for (int j = 0; j < var; j += 1) {
            if (a.substring(i, i + var).equals(pat.substring(j, j + var)))
                return true;
        }
    }
    return false;
}
