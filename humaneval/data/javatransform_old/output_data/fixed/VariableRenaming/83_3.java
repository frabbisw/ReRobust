public static int sum_squares(int[] lst) {
    int result = 0;
    for (int var = 0; var < lst.length; var += 1) {
        if (var % 3 == 0)
            result += lst[var] * lst[var];
        else if (var % 4 == 0)
            result += lst[var] * lst[var] * lst[var];
        else
            result += lst[var];
    }
    return result;
}
