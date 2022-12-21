public java.util.ArrayList<cl.flores.nicolas.spheroedu.Wrappers.RobotWrapper> getDependentWrapper() {
    java.util.List<cl.flores.nicolas.spheroedu.Wrappers.RobotWrapper> sublist = robots.subList((1 + (independent)), robots.size());
    return new java.util.ArrayList(sublist);
}
