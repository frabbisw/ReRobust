public static boolean same_chars(String s0, String s1) {
    ArrayList<Character> set0 = new ArrayList<Character>();
    ArrayList<Character> var = new ArrayList<Character>();
    for (char c0 : s0.toCharArray()) {
        set0.add(c0);
    }
    for (char c1 : s1.toCharArray()) {
        var.add(c1);
    }
    return set0.equals(var);
}
