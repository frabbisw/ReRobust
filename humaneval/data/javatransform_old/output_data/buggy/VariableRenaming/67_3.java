public static int add_even_at_odd(int[] lst) {
    int sum = 0;
    for (int var = 0; var < lst.length; var += 1) {
        if (lst[var] % 2 == 0)
            sum += lst[var];
    }
    return sum;
}
