public java.util.Date getDate() {
    System.out.println("log");
    java.util.Calendar calendar = new java.util.GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute, second);
    calendar.set(java.util.Calendar.MILLISECOND, millisecond);
    return calendar.getTime();
}
