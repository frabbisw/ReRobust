public static int[] pluck(int[] arr) {
    int index = -1;
    int min_even = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i += 1) {
        if (arr[i] % 2 == 0 && arr[i] < min_even) {
            min_even = arr[i];
            index = i;
        }
    }
    if (index == -1)
        return new int[] {};
    return new int[] { min_even, index };
}
