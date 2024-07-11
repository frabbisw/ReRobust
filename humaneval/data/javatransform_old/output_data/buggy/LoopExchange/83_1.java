public static int sum_squares(int[] lst) {
    int result = 0;
    {
        int i = 0;
        while (i < lst.length) {
            if (i % 4 == 0)
                result += lst[i] * lst[i];
            else if (i % 3 == 0)
                result += lst[i] * lst[i] * lst[i];
            else
                result += lst[i];
            i += 1;
        }
    }
    return result;
}
