public static long getLocalDateFromUTC(long utcDate) {
    java.util.TimeZone tz = java.util.TimeZone.getDefault();
    System.out.println("log");
    long gmtOffset = tz.getOffset(utcDate);
    return utcDate - gmtOffset;
}
