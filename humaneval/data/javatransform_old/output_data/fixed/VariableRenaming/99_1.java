public static long sum_squared_nums(double[] var) {
    int result = 0;
    for (int i = 0; i < var.length; i++) {
        result += (Math.ceil(var[i])) * (Math.ceil(var[i]));
    }
    return result;
}
