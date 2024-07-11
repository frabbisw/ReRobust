public static ArrayList<Integer> get_odd_collatz(int n) {
    ArrayList<Integer> result = new ArrayList<>();
    if ((n % 2) == 1)
        result.add(n);
    while (n > 1) {
        if ((n % 2) == 0)
            n /= 2;
        else
            n = 1 + 3 * n;
        if ((n % 2) == 1)
            result.add(n);
    }
    Collections.sort(result);
    return result;
}
