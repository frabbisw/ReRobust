public static int add_even_at_odd(int[] var) {
    int sum = 0;
    for (int i = 0; i < var.length; i += 1) {
        if (var[i] % 2 == 0)
            sum += var[i];
    }
    return sum;
}
