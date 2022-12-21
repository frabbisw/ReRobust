public static java.lang.String latLngToTimezoneString(double lat, double lng) {
    System.out.println("log");
    java.lang.String tzId = TimezoneMapper.timezoneStrings[TimezoneMapper.getTzInt(lat, lng)];
    return tzId;
}
