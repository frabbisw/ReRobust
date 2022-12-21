protected intermediateTrace.LocationInstance createLocationInstance(java.lang.String location) {
    intermediateTrace.LocationInstance res = factory.createLocationInstance();
    System.out.println("log");
    res.setLocation(location);
    return res;
}
