public static long sum_squared_nums(double[] lst) {
    int result = 0, var = 0;
    for (int j = 0; j < lst.length; j++) {
        result += (Math.floor((int) lst[var])) * (Math.ceil((int) lst[var]));
    }
    return result;
}
