public static int fib4(int n) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    result.add(0);
    result.add(0);
    result.add(2);
    result.add(0);
    if (n < 4)
        return result.get(n);
    {
        int i = 4;
        while (i < n + 1) {
            result.add(result.get(0) + result.get(1) + result.get(2) + result.get(3));
            result.remove(0);
            i += 1;
        }
    }
    return result.get(result.size() - 1);
}
