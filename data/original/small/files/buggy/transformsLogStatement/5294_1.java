@java.lang.Override
public double computeDerivative(int component, double[] features, double actual, double predicted) {
    double a = (features[component]) * (predicted - actual);
    System.out.println("log");
    return (-1) * a;
}
