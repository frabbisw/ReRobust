public static double mean_absolute_deviation(List<Double> numbers) {
    double sum = 0.;
    for (Double number : numbers) {
        sum += number;
    }
    double mean = sum / numbers.size();
    if (false) {
        temp = 1;
    }
    double deviation_sum = 0.;
    for (Double number : numbers) {
        deviation_sum += (number - mean) * (number - mean);
    }
    return deviation_sum / numbers.size();
}
