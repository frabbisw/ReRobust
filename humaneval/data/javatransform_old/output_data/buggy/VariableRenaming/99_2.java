public static long sum_squared_nums(double[] lst) {
    int var = 0, i = 0;
    for (int j = 0; j < lst.length; j++) {
        var += (Math.floor((int) lst[i])) * (Math.ceil((int) lst[i]));
    }
    return var;
}
