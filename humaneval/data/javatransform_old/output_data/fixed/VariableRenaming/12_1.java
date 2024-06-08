public static int prod_signs(int[] var) {
    if (var.length == 0)
        return -10;
    int prod = 1;
    for (int i = 0; i < var.length; i++) {
        if (var[i] == 0)
            prod = 0;
        else if (var[i] < 0)
            prod *= -1;
    }
    int sum = 0;
    for (int i = 0; i < var.length; i++) {
        sum += Math.abs(var[i]);
    }
    return prod * sum;
}
