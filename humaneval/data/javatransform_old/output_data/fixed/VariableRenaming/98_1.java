public static double[] rescale_to_unit(double[] var) {
    double min = Double.MAX_VALUE;
    double max = Double.MIN_VALUE;
    for (int i = 0; i < var.length; i += 1) {
        if (var[i] > max) {
            max = var[i];
        }
        if (var[i] < min) {
            min = var[i];
        }
    }
    double[] result = new double[var.length];
    for (int i = 0; i < var.length; i += 1) {
        result[i] = (var[i] - min) / (max - min);
    }
    return result;
}
