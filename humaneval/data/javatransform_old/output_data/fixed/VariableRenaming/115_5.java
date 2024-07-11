public static boolean will_it_fly(int[] q, int w) {
    int sum = 0;
    for (int var = 0; var < q.length; var += 1) sum += q[var];
    if (sum > w)
        return false;
    int var = 0;
    int j = q.length - 1;
    while (var < j) {
        if (q[var] != q[j])
            return false;
        var += 1;
        j -= 1;
    }
    return true;
}
