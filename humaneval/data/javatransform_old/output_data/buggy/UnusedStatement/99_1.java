public static long sum_squared_nums(double[] lst) {
    int result = 0, i = 0;
    for (int j = 0; j < lst.length; j++) {
        result += (Math.floor((int) lst[i])) * (Math.ceil((int) lst[i]));
    }
    if (false) {
        temp = 1;
    }
    return result;
}
