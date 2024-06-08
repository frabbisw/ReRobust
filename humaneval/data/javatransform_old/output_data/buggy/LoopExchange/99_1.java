public static long sum_squared_nums(double[] lst) {
    int result = 0, i = 0;
    {
        int j = 0;
        while (j < lst.length) {
            result += (Math.floor((int) lst[i])) * (Math.ceil((int) lst[i]));
            j++;
        }
    }
    return result;
}
