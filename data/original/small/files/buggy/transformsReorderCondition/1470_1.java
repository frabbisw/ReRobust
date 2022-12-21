public static boolean isValidMinuteOrSecond(int hour) {
    if ((hour <= 59) && (hour >= 0))
        return true;
    else
        return false;
}
