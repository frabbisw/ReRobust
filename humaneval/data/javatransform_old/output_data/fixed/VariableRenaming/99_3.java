public static long sum_squared_nums(double[] lst) {
    int result = 0;
    for (int var = 0; var < lst.length; var++) {
        result += (Math.ceil(lst[var])) * (Math.ceil(lst[var]));
    }
    return result;
}
