public static double mean_absolute_deviation(List<Double> numbers) {
    double sum = 0.;
    for (Double number : numbers) {
        sum += number;
    }
    double mean = sum / numbers.size();
    double var = 0.;
    for (Double number : numbers) {
        var += Math.abs(number - mean);
    }
    return var / numbers.size();
}
