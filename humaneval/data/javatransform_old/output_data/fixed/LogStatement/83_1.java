public static int sum_squares(int[] lst) {
    int result = 0;
    System.out.println("log");
    for (int i = 0; i < lst.length; i += 1) {
        if (i % 3 == 0)
            result += lst[i] * lst[i];
        else if (i % 4 == 0)
            result += lst[i] * lst[i] * lst[i];
        else
            result += lst[i];
    }
    return result;
}