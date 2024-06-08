public static ArrayList<Integer> make_a_pile(int n) {
    ArrayList<Integer> pile = new ArrayList<Integer>();
    try {
        for (int i = 0; i < n; i++) {
            pile.add(n - 2 * i);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return pile;
}
