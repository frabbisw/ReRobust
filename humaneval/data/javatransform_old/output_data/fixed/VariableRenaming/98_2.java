public static double[] rescale_to_unit(double[] numbers) {
    double var = Double.MAX_VALUE;
    double max = Double.MIN_VALUE;
    for (int i = 0; i < numbers.length; i += 1) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
        if (numbers[i] < var) {
            var = numbers[i];
        }
    }
    double[] result = new double[numbers.length];
    for (int i = 0; i < numbers.length; i += 1) {
        result[i] = (numbers[i] - var) / (max - var);
    }
    return result;
}
