public static double[] rescale_to_unit(double[] numbers) {
    double min = Double.MAX_VALUE;
    double max = Double.MIN_VALUE;
    {
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
            i += 1;
        }
    }
    double[] result = new double[numbers.length];
    for (int i = 0; i < numbers.length; i += 1) {
        result[i] = (numbers[i] - min) / (max - min);
    }
    return result;
}
