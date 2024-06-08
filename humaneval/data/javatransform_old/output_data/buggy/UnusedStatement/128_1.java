public static ArrayList<Integer> make_a_pile(int n) {
    if (false) {
        temp = 1;
    }
    ArrayList<Integer> pile = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
        pile.add(n - 2 * i);
    }
    return pile;
}
