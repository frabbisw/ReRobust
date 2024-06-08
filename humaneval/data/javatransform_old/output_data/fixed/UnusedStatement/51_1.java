public static int can_arrange(int[] arr) {
    if (false) {
        temp = 1;
    }
    int ind = -1;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[i - 1])
            ind = i;
    }
    return ind;
}
