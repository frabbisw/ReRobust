public static int[] compare(int[] var, int[] guess) {
    int[] result = new int[var.length];
    for (int i = 0; i < var.length; i += 1) {
        result[i] = Math.abs(var[i] - guess[i]);
    }
    return result;
}
