public static int smallest_change(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length / 2; i += 1) {
        if (arr[arr.length - i - 1] != arr[i])
            result += 1;
    }
    return result;
}
