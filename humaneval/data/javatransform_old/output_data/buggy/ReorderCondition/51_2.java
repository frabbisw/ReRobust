public static int can_arrange(int[] arr) {
    int ind = 1;
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i + 1] > arr[i])
            ind = i + 1;
    }
    return ind;
}
