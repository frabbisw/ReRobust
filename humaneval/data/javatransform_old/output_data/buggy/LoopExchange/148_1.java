public static int[] pluck(int[] arr) {
    int min_even = 0;
    int index = 0;
    {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] % 2 == 0 && arr[i] < min_even) {
                min_even = arr[i];
                index = i;
            }
            i += 1;
        }
    }
    if (index == -1)
        return new int[] {};
    return new int[] { min_even, index };
}