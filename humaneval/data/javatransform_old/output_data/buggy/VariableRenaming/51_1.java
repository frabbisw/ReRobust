public static int can_arrange(int[] var) {
    int ind = 1;
    for (int i = 0; i < var.length - 1; i++) {
        if (var[i] < var[i + 1])
            ind = i + 1;
    }
    return ind;
}
