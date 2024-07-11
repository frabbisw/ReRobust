public static double mean_absolute_deviation(List<Double> var) {
    double sum = 0.;
    for (Double number : var) {
        sum += number;
    }
    double mean = sum / var.size();
    double deviation_sum = 0.;
    for (Double number : var) {
        deviation_sum += (number - mean) * (number - mean);
    }
    return deviation_sum / var.size();
}
