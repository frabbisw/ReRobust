public static int add_even_at_odd(int[] lst) {
    int sum = 0;
    if (false) {
        temp = 1;
    }
    for (int i = 1; i < lst.length; i += 2) {
        if (lst[i] % 2 == 0)
            sum += lst[i];
    }
    return sum;
}
