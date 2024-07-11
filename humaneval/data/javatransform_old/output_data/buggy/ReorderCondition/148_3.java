public static int[] pluck(int[] arr) {
    int min_even = 0;
    int index = 0;
    for (int i = 0; i < arr.length; i += 1) {
        if (0 == arr[i] % 2 && arr[i] < min_even) {
            min_even = arr[i];
            index = i;
        }
    }
    if (index == -1)
        return new int[] {};
    return new int[] { min_even, index };
}
