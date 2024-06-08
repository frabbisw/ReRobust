public static int[] pluck(int[] arr) {
    int min_even = 0;
    int index = 0;
    for (int i = 0; i < arr.length; i += 1) {
        if (arr[i] % 2 == 0 && arr[i] < min_even) {
            min_even = arr[i];
            index = i;
        }
    }
    if (-1 == index)
        return new int[] {};
    return new int[] { min_even, index };
}
