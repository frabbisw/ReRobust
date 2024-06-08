public static int fib4(int n) {
    ArrayList<Integer> var = new ArrayList<Integer>();
    var.add(0);
    var.add(0);
    var.add(2);
    var.add(0);
    if (n < 4)
        return var.get(n);
    for (int i = 4; i < n + 1; i += 1) {
        var.add(var.get(0) + var.get(1) + var.get(2) + var.get(3));
        var.remove(0);
    }
    return var.get(var.size() - 1);
}
