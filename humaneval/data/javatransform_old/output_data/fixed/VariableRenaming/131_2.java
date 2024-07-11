public static ArrayList<Integer> get_odd_collatz(int n) {
    ArrayList<Integer> var = new ArrayList<>();
    if ((n % 2) == 1)
        var.add(n);
    while (n > 1) {
        if ((n % 2) == 0)
            n /= 2;
        else
            n = 3 * n + 1;
        if ((n % 2) == 1)
            var.add(n);
    }
    Collections.sort(var);
    return var;
}
