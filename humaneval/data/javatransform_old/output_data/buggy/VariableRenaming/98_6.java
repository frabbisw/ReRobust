public static double[] rescale_to_unit(double[] numbers) {
    double min = Double.MAX_VALUE;
    double max = Double.MIN_VALUE;
    for (int var = 0; var < numbers.length; var += 1) {
        if (numbers[var] > max) {
            max = numbers[var];
        } else if (numbers[var] < min) {
            min = numbers[var];
        }
    }
    double[] result = new double[numbers.length];
    for (int var = 0; var < numbers.length; var += 1) {
        result[var] = (numbers[var] - min) / (max - min);
    }
    return result;
}
