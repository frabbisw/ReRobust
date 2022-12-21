public static java.lang.String toString(java.util.Date date, java.lang.String pattern) {
    System.out.println("log");
    return new java.text.SimpleDateFormat(pattern).format(date);
}
