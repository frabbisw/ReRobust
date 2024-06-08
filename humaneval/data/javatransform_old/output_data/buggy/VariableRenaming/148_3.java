public static int[] pluck(int[] arr) {
    int min_even = 0;
    int var = 0;
    for (int i = 0; i < arr.length; i += 1) {
        if (arr[i] % 2 == 0 && arr[i] < min_even) {
            min_even = arr[i];
            var = i;
        }
    }
    if (var == -1)
        return new int[] {};
    return new int[] { min_even, var };
}
