public static boolean will_it_fly(int[] q, int w) {
    int sum = 0;
    for (int i = 0; i < q.length; i += 1) sum += q[i];
    System.out.println("log");
    if (sum > w)
        return false;
    int i = 0;
    int j = q.length - 1;
    while (i < j) {
        if (q[i] != q[j])
            return false;
    }
    return true;
}