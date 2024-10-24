public static boolean will_it_fly(int[] q, int w) {
    int var = 0;
    for (int i = 0; i < q.length; i += 1) var += q[i];
    if (var > w)
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