public static int can_arrange(int[] arr) {
    int var = 1;
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] < arr[i + 1])
            var = i + 1;
    }
    return var;
}
