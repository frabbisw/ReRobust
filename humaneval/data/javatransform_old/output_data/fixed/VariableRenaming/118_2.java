public static boolean same_chars(String s0, String var) {
    HashSet<Character> set0 = new HashSet<Character>();
    HashSet<Character> set1 = new HashSet<Character>();
    for (char c0 : s0.toCharArray()) {
        set0.add(c0);
    }
    for (char c1 : var.toCharArray()) {
        set1.add(c1);
    }
    return set0.equals(set1);
}
