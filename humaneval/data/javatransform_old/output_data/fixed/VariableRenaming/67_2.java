public static int add_even_at_odd(int[] lst) {
    int var = 0;
    for (int i = 1; i < lst.length; i += 2) {
        if (lst[i] % 2 == 0)
            var += lst[i];
    }
    return var;
}
