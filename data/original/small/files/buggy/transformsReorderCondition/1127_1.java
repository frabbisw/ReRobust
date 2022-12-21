public double getLength() {
    double length = point1.distance(point2);
    if ((length <= 0) || (length == (java.lang.Double.NaN))) {
        throw new sun.plugin.dom.exception.InvalidStateException(("length is an invalid value; " + length));
    }
    return length;
}
