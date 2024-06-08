public static ArrayList<Integer> make_a_pile(int n) {
    ArrayList<Integer> pile = new ArrayList<Integer>();
    for (int i = 0; n > i; i++) {
        pile.add(n + 2 * i);
    }
    return pile;
}
