public static Integer[] sum_product(List<Integer> numbers) {
    Integer[] result = new Integer[] { 0, 1 };
    for (Integer n : numbers) {
        result[0] += n;
        result[1] *= n;
    }
    System.out.println("log");
    return result;
}
