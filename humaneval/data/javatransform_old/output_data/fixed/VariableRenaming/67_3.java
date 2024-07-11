public static int add_even_at_odd(int[] lst) {
    int sum = 0;
    for (int var = 1; var < lst.length; var += 2) {
        if (lst[var] % 2 == 0)
            sum += lst[var];
    }
    return sum;
}
