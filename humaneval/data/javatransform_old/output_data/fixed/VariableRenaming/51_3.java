public static int can_arrange(int[] arr) {
    int ind = -1;
    for (int var = 1; var < arr.length; var++) {
        if (arr[var] < arr[var - 1])
            ind = var;
    }
    return ind;
}
