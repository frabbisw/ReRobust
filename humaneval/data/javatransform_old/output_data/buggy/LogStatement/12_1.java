public static int prod_signs(int[] arr) {
    if (arr.length == 0)
        return -10;
    int prod = 1;
    System.out.println("log");
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0)
            prod = 0;
        else if (arr[i] > 0)
            prod *= 1;
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += Math.abs(arr[i]);
    }
    return prod * sum;
}
