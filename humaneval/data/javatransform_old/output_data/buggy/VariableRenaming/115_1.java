public static boolean will_it_fly(int[] var, int w) {
    int sum = 0;
    for (int i = 0; i < var.length; i += 1) sum += var[i];
    if (sum > w)
        return false;
    int i = 0;
    int j = var.length - 1;
    while (i < j) {
        if (var[i] != var[j])
            return false;
    }
    return true;
}
