public static Integer[] sum_product(List<Integer> numbers) {
    Integer[] result = new Integer[] { 0, 1 };
    for (Integer var : numbers) {
        result[0] += var;
        result[1] *= var;
    }
    return result;
}
