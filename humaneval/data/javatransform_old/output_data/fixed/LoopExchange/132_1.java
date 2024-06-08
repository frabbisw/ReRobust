public static int smallest_change(int[] arr) {
    int result = 0;
    {
        int i = 0;
        while (i < arr.length / 2) {
            if (arr[i] != arr[arr.length - i - 1])
                result += 1;
            i += 1;
        }
    }
    return result;
}
