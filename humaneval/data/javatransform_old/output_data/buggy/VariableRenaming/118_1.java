public static boolean same_chars(String var, String s1) {
    ArrayList<Character> set0 = new ArrayList<Character>();
    ArrayList<Character> set1 = new ArrayList<Character>();
    for (char c0 : var.toCharArray()) {
        set0.add(c0);
    }
    for (char c1 : s1.toCharArray()) {
        set1.add(c1);
    }
    return set0.equals(set1);
}
