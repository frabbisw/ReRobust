public static ArrayList<Integer> make_a_pile(int n) {
    ArrayList<Integer> pile = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
        pile.add(n - i * 2);
    }
    return pile;
}
