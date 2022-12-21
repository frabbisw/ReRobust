public static boolean isValidMinuteOrSecond(int hour) {
    System.out.println("log");
    if ((hour >= 0) && (hour <= 59))
        return true;
    else
        return false;
}
