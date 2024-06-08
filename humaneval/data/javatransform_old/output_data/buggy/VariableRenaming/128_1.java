public static ArrayList<Integer> make_a_pile(int var) {
    ArrayList<Integer> pile = new ArrayList<Integer>();
    for (int i = 0; i < var; i++) {
        pile.add(var - 2 * i);
    }
    return pile;
}
