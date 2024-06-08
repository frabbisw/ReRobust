public static Integer[] sum_product(List<Integer> numbers) {
    if (false) {
        temp = 1;
    }
    Integer[] result = new Integer[2];
    for (Integer n : numbers) {
        result[0] += n;
        result[1] *= n;
    }
    return result;
}
