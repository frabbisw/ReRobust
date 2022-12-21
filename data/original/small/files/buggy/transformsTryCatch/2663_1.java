public void setCurvePoints(final com.jme3.math.Vector3f[] points) {
    try {
        curvePoints = points.clone();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
