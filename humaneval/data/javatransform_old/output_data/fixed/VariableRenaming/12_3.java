public static int prod_signs(int[] arr) {
    if (arr.length == 0)
        return -10;
    int prod = 1;
    for (int var = 0; var < arr.length; var++) {
        if (arr[var] == 0)
            prod = 0;
        else if (arr[var] < 0)
            prod *= -1;
    }
    int sum = 0;
    for (int var = 0; var < arr.length; var++) {
        sum += Math.abs(arr[var]);
    }
    return prod * sum;
}
