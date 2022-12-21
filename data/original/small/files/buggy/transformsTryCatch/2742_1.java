public void warn(org.slf4j.Marker marker, java.lang.String msg) {
    try {
        recordEvent(Level.WARN, msg, null, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
