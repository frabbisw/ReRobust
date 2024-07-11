public static int can_arrange(int[] arr) {
    int ind = 1;
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] < arr[1 + i])
            ind = 1 + i;
    }
    return ind;
}
