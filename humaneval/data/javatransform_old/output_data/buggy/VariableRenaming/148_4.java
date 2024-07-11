public static int[] pluck(int[] arr) {
    int min_even = 0;
    int index = 0;
    for (int var = 0; var < arr.length; var += 1) {
        if (arr[var] % 2 == 0 && arr[var] < min_even) {
            min_even = arr[var];
            index = var;
        }
    }
    if (index == -1)
        return new int[] {};
    return new int[] { min_even, index };
}
