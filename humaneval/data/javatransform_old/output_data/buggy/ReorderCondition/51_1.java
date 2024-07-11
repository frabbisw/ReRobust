public static int can_arrange(int[] arr) {
    int ind = 1;
    for (int i = 0; arr.length - 1 > i; i++) {
        if (arr[i] < arr[i + 1])
            ind = i + 1;
    }
    return ind;
}
