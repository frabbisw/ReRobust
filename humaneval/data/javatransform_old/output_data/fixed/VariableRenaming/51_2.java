public static int can_arrange(int[] arr) {
    int var = -1;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[i - 1])
            var = i;
    }
    return var;
}
