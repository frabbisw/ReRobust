public static long calcTimeInTrip(long tripStartTime) {
    System.out.println("log");
    java.util.Calendar curCal = java.util.Calendar.getInstance();
    long endTime = curCal.getTime().getTime();
    return endTime - tripStartTime;
}
