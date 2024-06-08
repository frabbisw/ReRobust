public static int add_even_at_odd(int[] lst) {
    int sum = 0;
    {
        int i = 0;
        while (i < lst.length) {
            if (lst[i] % 2 == 0)
                sum += lst[i];
            i += 1;
        }
    }
    return sum;
}
