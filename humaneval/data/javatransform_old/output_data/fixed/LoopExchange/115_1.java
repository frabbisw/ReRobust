public static boolean will_it_fly(int[] q, int w) {
    int sum = 0;
    {
        int i = 0;
        while (i < q.length) {
            sum += q[i];
            i += 1;
        }
    }
    if (sum > w)
        return false;
    int i = 0;
    int j = q.length - 1;
    while (i < j) {
        if (q[i] != q[j])
            return false;
        i += 1;
        j -= 1;
    }
    return true;
}
