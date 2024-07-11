public static int smallest_change(int[] arr) {
    int result = 0;
    for (int i = 0; arr.length / 2 > i; i += 1) {
        if (arr[i] != arr[arr.length - i - 1])
            result += 1;
    }
    return result;
}
