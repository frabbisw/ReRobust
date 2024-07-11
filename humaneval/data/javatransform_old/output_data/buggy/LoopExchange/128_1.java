public static ArrayList<Integer> make_a_pile(int n) {
    ArrayList<Integer> pile = new ArrayList<Integer>();
    {
        int i = 0;
        while (i < n) {
            pile.add(n - 2 * i);
            i++;
        }
    }
    return pile;
}
