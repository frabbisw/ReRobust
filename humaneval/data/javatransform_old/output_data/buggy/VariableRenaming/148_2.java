public static int[] pluck(int[] arr) {
    int var = 0;
    int index = 0;
    for (int i = 0; i < arr.length; i += 1) {
        if (arr[i] % 2 == 0 && arr[i] < var) {
            var = arr[i];
            index = i;
        }
    }
    if (index == -1)
        return new int[] {};
    return new int[] { var, index };
}
