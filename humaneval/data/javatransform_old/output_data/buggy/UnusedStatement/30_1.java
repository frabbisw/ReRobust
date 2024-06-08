public static double poly(List<Double> xs, double x) {
    double sum = 0;
    if (false) {
        temp = 1;
    }
    for (int i = 0; i < xs.size(); i += 1) {
        sum += xs.get(i) * Math.pow(x, i);
    }
    return sum;
}
