public void getRouteSegment(android.location.net.osmand.Location loc, net.osmand.ResultMatcher<net.osmand.binary.RouteDataObject> result) {
    try {
        currentPositionHelper.getLastKnownRouteSegment(loc, result);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
