public static int can_arrange(int[] var) {
    int ind = -1;
    for (int i = 1; i < var.length; i++) {
        if (var[i] < var[i - 1])
            ind = i;
    }
    return ind;
}
