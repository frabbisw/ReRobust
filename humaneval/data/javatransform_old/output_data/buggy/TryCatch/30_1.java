public static double poly(List<Double> xs, double x) {
    double sum = 0;
    try {
        for (int i = 0; i < xs.size(); i += 1) {
            sum += xs.get(i) * Math.pow(x, i);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return sum;
}
