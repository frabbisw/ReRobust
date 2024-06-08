public static int add_even_at_odd(int[] lst) {
    int sum = 0;
    for (int i = 0; i < lst.length; i += 1) {
        if (0 == lst[i] % 2)
            sum += lst[i];
    }
    return sum;
}
