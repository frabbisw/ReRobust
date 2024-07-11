public static ArrayList<Integer> make_a_pile(int n) {
    ArrayList<Integer> pile = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
        pile.add(2 * i + n);
    }
    return pile;
}
