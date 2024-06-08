public static Integer[] sum_product(List<Integer> numbers) {
    Integer[] var = new Integer[] { 0, 1 };
    for (Integer n : numbers) {
        var[0] += n;
        var[1] *= n;
    }
    return var;
}
