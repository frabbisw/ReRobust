public static long sum_squared_nums(double[] lst) {
    int var = 0;
    for (int i = 0; i < lst.length; i++) {
        var += (Math.ceil(lst[i])) * (Math.ceil(lst[i]));
    }
    return var;
}
