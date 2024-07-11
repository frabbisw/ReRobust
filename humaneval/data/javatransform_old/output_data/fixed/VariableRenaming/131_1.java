public static ArrayList<Integer> get_odd_collatz(int var) {
    ArrayList<Integer> result = new ArrayList<>();
    if ((var % 2) == 1)
        result.add(var);
    while (var > 1) {
        if ((var % 2) == 0)
            var /= 2;
        else
            var = 3 * var + 1;
        if ((var % 2) == 1)
            result.add(var);
    }
    Collections.sort(result);
    return result;
}
