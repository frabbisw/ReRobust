public static int can_arrange(int[] arr) {
    int ind = 1;
    for (int var = 0; var < arr.length - 1; var++) {
        if (arr[var] < arr[var + 1])
            ind = var + 1;
    }
    return ind;
}
