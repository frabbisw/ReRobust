protected intermediateTrace.LocationInstance createLocationInstance(java.lang.String location) {
    intermediateTrace.LocationInstance res = factory.createLocationInstance();
    try {
        res.setLocation(location);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return res;
}
