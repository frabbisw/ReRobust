public static int sum_squares(int[] var) {
    int result = 0;
    for (int i = 0; i < var.length; i += 1) {
        if (i % 3 == 0)
            result += var[i] * var[i];
        else if (i % 4 == 0)
            result += var[i] * var[i] * var[i];
        else
            result += var[i];
    }
    return result;
}
