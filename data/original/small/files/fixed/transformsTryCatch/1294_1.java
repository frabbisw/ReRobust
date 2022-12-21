public double evaluate(java.lang.String s, java.lang.String sx, java.lang.Double vx) {
    java.lang.String dx = java.lang.Double.toString(vx);
    double y = 0;
    try {
        y = calculateMath(sx, dx, s);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return y;
}
