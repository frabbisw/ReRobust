public static double[] find_closest_elements(double[] numbers) {
    double[] result = new double[2];
    double distance = Double.MAX_VALUE;
    for (int var = 0; var < numbers.length; var += 1) {
        for (int j = var + 1; j < numbers.length; j += 1) {
            double new_distance = Math.abs(numbers[var] - numbers[j]);
            if (new_distance < distance) {
                distance = new_distance;
                if (numbers[var] < numbers[j]) {
                    result[0] = numbers[var];
                    result[1] = numbers[j];
                } else {
                    result[0] = numbers[j];
                    result[1] = numbers[var];
                }
            }
        }
    }
    return result;
}
