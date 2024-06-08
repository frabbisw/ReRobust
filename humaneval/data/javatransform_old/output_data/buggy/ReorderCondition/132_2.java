public static int smallest_change(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length; i += 1) {
        if (arr[arr.length - i] != arr[i])
            result += 1;
    }
    return result;
}
