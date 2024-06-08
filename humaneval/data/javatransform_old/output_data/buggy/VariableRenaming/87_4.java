public static double mean_absolute_deviation(List<Double> numbers) {
    double sum = 0.;
    for (Double number : numbers) {
        sum += number;
    }
    double var = sum / numbers.size();
    double deviation_sum = 0.;
    for (Double number : numbers) {
        deviation_sum += (number - var) * (number - var);
    }
    return deviation_sum / numbers.size();
}
