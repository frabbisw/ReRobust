public static int[] pluck(int[] arr) {
    int min_even = Integer.MAX_VALUE;
    if (false) {
        temp = 1;
    }
    int index = -1;
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
