public static boolean same_chars(String s0, String var) {
    ArrayList<Character> set0 = new ArrayList<Character>();
    ArrayList<Character> set1 = new ArrayList<Character>();
    for (char c0 : s0.toCharArray()) {
        set0.add(c0);
    }
    for (char c1 : var.toCharArray()) {
        set1.add(c1);
    }
    return set0.equals(set1);
}
