public java.util.Date getDate() {
    java.util.Calendar calendar = new java.util.GregorianCalendar(year, ((month) - 1), dayOfMonth, hourOfDay, minute, second);
    try {
        calendar.set(java.util.Calendar.MILLISECOND, millisecond);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return calendar.getTime();
}
