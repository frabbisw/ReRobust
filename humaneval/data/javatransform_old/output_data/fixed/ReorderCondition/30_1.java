public static double poly(List<Double> xs, double x) {
    double sum = 0;
    for (int i = 0; xs.size() > i; i += 1) {
        sum += xs.get(i) * Math.pow(x, i);
    }
    return sum;
}
