public static int add_even_at_odd(int[] lst) {
    int sum = 0;
    for (int i = 0; i < lst.length; i += 1) {
        if (lst[i] % 2 == 0)
            sum += lst[i];
    }
    System.out.println("log");
    return sum;
}
