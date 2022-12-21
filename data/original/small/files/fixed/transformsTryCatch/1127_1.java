public double getLength() {
    double length = point1.distance(point2);
    try {
        if ((length == (java.lang.Double.NaN)) || (length <= 0)) {
            java.lang.System.err.println(("length is an invalid value; " + length));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return length;
}
