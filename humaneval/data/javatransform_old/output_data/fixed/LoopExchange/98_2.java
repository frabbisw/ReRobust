public static double[] rescale_to_unit(double[] numbers) {
    double min = Double.MAX_VALUE;
    double max = Double.MIN_VALUE;
    for (int i = 0; i < numbers.length; i += 1) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
        if (numbers[i] < min) {
            min = numbers[i];
        }
    }
    double[] result = new double[numbers.length];
    {
        int i = 0;
        while (i < numbers.length) {
            result[i] = (numbers[i] - min) / (max - min);
            i += 1;
        }
    }
    return result;
}
