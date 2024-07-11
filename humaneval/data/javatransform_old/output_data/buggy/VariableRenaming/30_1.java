public static double poly(List<Double> var, double x) {
    double sum = 0;
    for (int i = 0; i < var.size(); i += 1) {
        sum += var.get(i) * Math.pow(x, i);
    }
    return sum;
}
