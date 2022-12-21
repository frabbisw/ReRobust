public static net.sf.memoranda.date.CalendarDate yesterday() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    try {
        cal.roll(java.util.Calendar.DATE, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new net.sf.memoranda.date.CalendarDate(cal);
}
