public static int prod_signs(int[] arr) {
    if (arr.length == 0)
        return -10;
    int var = 1;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0)
            var = 0;
        else if (arr[i] < 0)
            var *= -1;
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += Math.abs(arr[i]);
    }
    return var * sum;
}
