public static double mean_absolute_deviation(List<Double> numbers) {
    double sum = 0.;
    for (Double number : numbers) {
        sum += number;
    }
    double mean = sum / numbers.size();
    double deviation_sum = 0.;
    try {
        for (Double number : numbers) {
            deviation_sum += Math.abs(number - mean);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return deviation_sum / numbers.size();
}
