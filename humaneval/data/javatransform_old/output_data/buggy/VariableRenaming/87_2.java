public static double mean_absolute_deviation(List<Double> numbers) {
    double var = 0.;
    for (Double number : numbers) {
        var += number;
    }
    double mean = var / numbers.size();
    double deviation_sum = 0.;
    for (Double number : numbers) {
        deviation_sum += (number - mean) * (number - mean);
    }
    return deviation_sum / numbers.size();
}
