public static long sum_squared_nums(double[] lst) {
    int result = 0, i = 0;
    for (int var = 0; var < lst.length; var++) {
        result += (Math.floor((int) lst[i])) * (Math.ceil((int) lst[i]));
    }
    return result;
}
