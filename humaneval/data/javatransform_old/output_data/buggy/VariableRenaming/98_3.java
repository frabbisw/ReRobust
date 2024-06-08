public static double[] rescale_to_unit(double[] numbers) {
    double min = Double.MAX_VALUE;
    double var = Double.MIN_VALUE;
    for (int i = 0; i < numbers.length; i += 1) {
        if (numbers[i] > var) {
            var = numbers[i];
        } else if (numbers[i] < min) {
            min = numbers[i];
        }
    }
    double[] result = new double[numbers.length];
    for (int i = 0; i < numbers.length; i += 1) {
        result[i] = (numbers[i] - min) / (var - min);
    }
    return result;
}
