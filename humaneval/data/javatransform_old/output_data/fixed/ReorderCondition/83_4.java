public static int sum_squares(int[] lst) {
    int result = 0;
    for (int i = 0; i < lst.length; i += 1) {
        if (i % 3 == 0)
            result += lst[i] * lst[i];
        else if (0 == i % 4)
            result += lst[i] * lst[i] * lst[i];
        else
            result += lst[i];
    }
    return result;
}
