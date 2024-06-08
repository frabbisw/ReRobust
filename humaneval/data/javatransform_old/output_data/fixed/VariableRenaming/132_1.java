public static int smallest_change(int[] var) {
    int result = 0;
    for (int i = 0; i < var.length / 2; i += 1) {
        if (var[i] != var[var.length - i - 1])
            result += 1;
    }
    return result;
}
