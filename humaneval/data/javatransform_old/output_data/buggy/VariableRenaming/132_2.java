public static int smallest_change(int[] arr) {
    int var = 0;
    for (int i = 0; i < arr.length; i += 1) {
        if (arr[i] != arr[arr.length - i])
            var += 1;
    }
    return var;
}
