public static double poly(List<Double> xs, double x) {
    double sum = 0;
    for (int var = 0; var < xs.size(); var += 1) {
        sum += xs.get(var) * Math.pow(x, var);
    }
    return sum;
}
