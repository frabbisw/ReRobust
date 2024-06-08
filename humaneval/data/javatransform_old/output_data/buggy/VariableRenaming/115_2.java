public static boolean will_it_fly(int[] q, int var) {
    int sum = 0;
    for (int i = 0; i < q.length; i += 1) sum += q[i];
    if (sum > var)
        return false;
    int i = 0;
    int j = q.length - 1;
    while (i < j) {
        if (q[i] != q[j])
            return false;
    }
    return true;
}
