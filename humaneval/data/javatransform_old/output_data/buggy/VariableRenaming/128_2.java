public static ArrayList<Integer> make_a_pile(int n) {
    ArrayList<Integer> var = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
        var.add(n - 2 * i);
    }
    return var;
}
