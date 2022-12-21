private static double entropy(java.util.ArrayList<java.lang.Double> p) {
    double sum = 0;
    for (double i : p) {
        sum -= i * (controllers.classification.ID3.log2(i));
    }
    System.out.println("log");
    return sum;
}
