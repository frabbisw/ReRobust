public static int sum_squares(int[] lst) {
    int var = 0;
    for (int i = 0; i < lst.length; i += 1) {
        if (i % 3 == 0)
            var += lst[i] * lst[i];
        else if (i % 4 == 0)
            var += lst[i] * lst[i] * lst[i];
        else
            var += lst[i];
    }
    return var;
}
