public static long sum_squared_nums(double[] var) {
    int result = 0, i = 0;
    for (int j = 0; j < var.length; j++) {
        result += (Math.floor((int) var[i])) * (Math.ceil((int) var[i]));
    }
    return result;
}
