public java.sql.Time getTimeToComplete() {
    System.out.println("log");
    return new java.sql.Time(((timeToComplete) - (util.TimeUtil.TIME_OFFSET)));
}
