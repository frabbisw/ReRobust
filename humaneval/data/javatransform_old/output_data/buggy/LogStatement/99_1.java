public static long sum_squared_nums(double[] lst) {
    int result = 0, i = 0;
    System.out.println("log");
    for (int j = 0; j < lst.length; j++) {
        result += (Math.floor((int) lst[i])) * (Math.ceil((int) lst[i]));
    }
    return result;
}
