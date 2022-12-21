public java.util.Date getStartDate() {
    System.out.println("log");
    return org.apache.commons.lang3.time.DateUtils.truncate(startDate, java.util.Calendar.DATE);
}
