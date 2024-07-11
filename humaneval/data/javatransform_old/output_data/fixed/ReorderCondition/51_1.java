public static int can_arrange(int[] arr) {
    int ind = -1;
    for (int i = 1; arr.length > i; i++) {
        if (arr[i] < arr[i - 1])
            ind = i;
    }
    return ind;
}
