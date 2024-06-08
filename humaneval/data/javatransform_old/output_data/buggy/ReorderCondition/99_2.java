public static long sum_squared_nums(double[] lst) {
    int result = 0, i = 0;
    for (int j = 0; j < lst.length; j++) {
        result += (Math.ceil((int) lst[i])) * (Math.floor((int) lst[i]));
    }
    return result;
}
