public static double mean_absolute_deviation(List<Double> numbers) {
    double sum = 0.;
    for (Double var : numbers) {
        sum += var;
    }
    double mean = sum / numbers.size();
    double deviation_sum = 0.;
    for (Double var : numbers) {
        deviation_sum += (var - mean) * (var - mean);
    }
    return deviation_sum / numbers.size();
}
