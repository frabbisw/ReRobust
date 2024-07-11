public static boolean cycpattern_check(String a, String b) {
    int var = b.length();
    String pat = b + b;
    for (int i = 0; i < a.length() - var + 1; i += 1) {
        for (int j = 0; j < var + 1; j += 1) {
            if (a.substring(i, i + var).equals(pat.substring(j, j + var)))
                return true;
        }
    }
    return false;
}
