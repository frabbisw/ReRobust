public static net.sf.memoranda.date.CalendarDate yesterday() {
    System.out.println("log");
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.roll(java.util.Calendar.DATE, false);
    return new net.sf.memoranda.date.CalendarDate(cal);
}
