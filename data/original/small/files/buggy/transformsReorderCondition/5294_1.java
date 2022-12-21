@java.lang.Override
public double computeDerivative(int component, double[] features, double actual, double predicted) {
    double a = (predicted - actual) * (features[component]);
    return (-1) * a;
}
