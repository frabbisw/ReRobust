public static double[] find_closest_elements(double[] numbers) {
    double[] result = new double[2];
    double distance = Double.MAX_VALUE;
    for (int i = 0; i < numbers.length; i += 1) {
        for (int var = i + 1; var < numbers.length; var += 1) {
            double new_distance = Math.abs(numbers[i] - numbers[var]);
            if (new_distance < distance) {
                distance = new_distance;
                if (numbers[i] < numbers[var]) {
                    result[0] = numbers[i];
                    result[1] = numbers[var];
                } else {
                    result[0] = numbers[var];
                    result[1] = numbers[i];
                }
            }
        }
    }
    return result;
}
