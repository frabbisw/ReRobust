public static boolean same_chars(String s0, String s1) {
    ArrayList<Character> set0 = new ArrayList<Character>();
    ArrayList<Character> set1 = new ArrayList<Character>();
    try {
        for (char c0 : s0.toCharArray()) {
            set0.add(c0);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (char c1 : s1.toCharArray()) {
        set1.add(c1);
    }
    return set0.equals(set1);
}