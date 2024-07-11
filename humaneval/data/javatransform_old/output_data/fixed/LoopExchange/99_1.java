public static long sum_squared_nums(double[] lst) {
    int result = 0;
    {
        int i = 0;
        while (i < lst.length) {
            result += (Math.ceil(lst[i])) * (Math.ceil(lst[i]));
            i++;
        }
    }
    return result;
}
