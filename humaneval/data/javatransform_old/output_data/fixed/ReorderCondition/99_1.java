public static long sum_squared_nums(double[] lst) {
    int result = 0;
    for (int i = 0; lst.length > i; i++) {
        result += (Math.ceil(lst[i])) * (Math.ceil(lst[i]));
    }
    return result;
}
