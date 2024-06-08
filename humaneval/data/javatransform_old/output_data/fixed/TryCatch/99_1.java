public static long sum_squared_nums(double[] lst) {
    int result = 0;
    try {
        for (int i = 0; i < lst.length; i++) {
            result += (Math.ceil(lst[i])) * (Math.ceil(lst[i]));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
