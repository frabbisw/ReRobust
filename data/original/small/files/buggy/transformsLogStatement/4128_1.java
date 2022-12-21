public void getRouteSegment(android.location.net.osmand.Location loc, net.osmand.ResultMatcher<net.osmand.binary.RouteDataObject> result) {
    System.out.println("log");
    currentPositionHelper.getLastKnownRouteSegment(loc, result);
}
