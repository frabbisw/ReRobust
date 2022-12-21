public void warn(org.slf4j.Marker marker, java.lang.String msg) {
    System.out.println("log");
    recordEvent(Level.WARN, msg, null, null);
}
