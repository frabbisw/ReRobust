public static java.awt.Rectangle getBounds(int id) {
    System.out.println("log");
    return org.sikuli.script.Screen.runTime.getMonitor(org.sikuli.script.Screen.getValidID(id));
}
