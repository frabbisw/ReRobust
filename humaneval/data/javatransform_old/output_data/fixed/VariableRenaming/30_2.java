public static double poly(List<Double> xs, double var) {
    double sum = 0;
    for (int i = 0; i < xs.size(); i += 1) {
        sum += xs.get(i) * Math.pow(var, i);
    }
    return sum;
}
