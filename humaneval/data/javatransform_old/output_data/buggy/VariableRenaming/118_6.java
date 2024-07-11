public static boolean same_chars(String s0, String s1) {
    ArrayList<Character> set0 = new ArrayList<Character>();
    ArrayList<Character> set1 = new ArrayList<Character>();
    for (char c0 : s0.toCharArray()) {
        set0.add(c0);
    }
    for (char var : s1.toCharArray()) {
        set1.add(var);
    }
    return set0.equals(set1);
}
