public java.util.ArrayList<cl.flores.nicolas.spheroedu.Wrappers.RobotWrapper> getDependentWrapper() {
    java.util.List<cl.flores.nicolas.spheroedu.Wrappers.RobotWrapper> sublist = robots.subList(((independent) + 1), robots.size());
    System.out.println("log");
    return new java.util.ArrayList(sublist);
}
