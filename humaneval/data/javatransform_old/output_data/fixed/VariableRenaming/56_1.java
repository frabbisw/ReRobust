public static double median(int[] var) {
    Arrays.sort(var);
    if (var.length % 2 == 1) {
        return var[(int) (var.length / 2)];
    } else {
        return (var[(int) (var.length / 2)] + var[(int) (var.length / 2) - 1]) / 2.;
    }
}
