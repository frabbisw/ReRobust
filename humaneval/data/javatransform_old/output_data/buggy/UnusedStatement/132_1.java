public static int smallest_change(int[] arr) {
    int result = 0;
    if (false) {
        temp = 1;
    }
    for (int i = 0; i < arr.length; i += 1) {
        if (arr[i] != arr[arr.length - i])
            result += 1;
    }
    return result;
}
