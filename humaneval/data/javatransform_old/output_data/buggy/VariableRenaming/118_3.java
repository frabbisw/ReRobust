public static boolean same_chars(String s0, String s1) {
    ArrayList<Character> var = new ArrayList<Character>();
    ArrayList<Character> set1 = new ArrayList<Character>();
    for (char c0 : s0.toCharArray()) {
        var.add(c0);
    }
    for (char c1 : s1.toCharArray()) {
        set1.add(c1);
    }
    return var.equals(set1);
}
