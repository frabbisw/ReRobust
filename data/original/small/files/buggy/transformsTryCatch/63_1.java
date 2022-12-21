private static double entropy(java.util.ArrayList<java.lang.Double> p) {
    double sum = 0;
    try {
        for (double i : p) {
            sum -= i * (controllers.classification.ID3.log2(i));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return sum;
}
