public static double poly(List<Double> xs, double x) {
    double sum = 0;
    for (int i = 0; i < xs.size(); i += 1) {
        sum += Math.pow(x, i) * xs.get(i);
    }
    return sum;
}
