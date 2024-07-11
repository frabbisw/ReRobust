public static int[] sort_array(int[] var) {
    if (var.length == 0)
        return var;
    Arrays.sort(var);
    if ((var[0] + var[var.length - 1]) % 2 == 1)
        return var;
    else {
        for (int i = 0; i < var.length / 2; i += 1) {
            int tmp = var[i];
            var[i] = var[var.length - i - 1];
            var[var.length - i - 1] = tmp;
        }
        return var;
    }
}
