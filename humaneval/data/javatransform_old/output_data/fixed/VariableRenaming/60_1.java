public static Integer[] sum_product(List<Integer> var) {
    Integer[] result = new Integer[] { 0, 1 };
    for (Integer n : var) {
        result[0] += n;
        result[1] *= n;
    }
    return result;
}
