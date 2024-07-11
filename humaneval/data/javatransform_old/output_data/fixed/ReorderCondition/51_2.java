public static int can_arrange(int[] arr) {
    int ind = -1;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i - 1] > arr[i])
            ind = i;
    }
    return ind;
}
