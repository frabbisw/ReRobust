public static ArrayList<Integer> make_a_pile(int n) {
    ArrayList<Integer> pile = new ArrayList<Integer>();
    for (int var = 0; var < n; var++) {
        pile.add(n - 2 * var);
    }
    return pile;
}
