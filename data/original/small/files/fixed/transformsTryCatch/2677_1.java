protected static boolean unexpectedSegmentAlert(org.usfirst.frc.team1197.TorTrajectoryLib.spline_generator.PathSegment.SegmentType type) {
    try {
        java.lang.System.err.println(((((org.usfirst.frc.team1197.TorTrajectoryLib.spline_generator.SplineErrMsg.basic_msg) + "Unexpected path segment (") + type) + ")."));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
