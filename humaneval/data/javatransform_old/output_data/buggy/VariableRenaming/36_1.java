public static int fib4(int var) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    result.add(0);
    result.add(0);
    result.add(2);
    result.add(0);
    if (var < 4)
        return result.get(var);
    for (int i = 4; i < var + 1; i += 1) {
        result.add(result.get(0) + result.get(1) + result.get(2) + result.get(3));
    }
    return result.get(result.size() - 1);
}
