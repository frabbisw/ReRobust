public static int smallest_change(int[] arr) {
    int result = 0;
    for (int i = 0; arr.length > i; i += 1) {
        if (arr[i] != arr[arr.length - i])
            result += 1;
    }
    return result;
}
