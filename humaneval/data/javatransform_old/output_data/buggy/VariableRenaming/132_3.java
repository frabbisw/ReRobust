public static int smallest_change(int[] arr) {
    int result = 0;
    for (int var = 0; var < arr.length; var += 1) {
        if (arr[var] != arr[arr.length - var])
            result += 1;
    }
    return result;
}
