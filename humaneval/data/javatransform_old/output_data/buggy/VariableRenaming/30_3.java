public static double poly(List<Double> xs, double x) {
    double var = 0;
    for (int i = 0; i < xs.size(); i += 1) {
        var += xs.get(i) * Math.pow(x, i);
    }
    return var;
}
