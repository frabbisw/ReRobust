public static java.lang.String toCSVDate(java.lang.Object obj) {
    System.out.println("log");
    org.joda.time.LocalDate date = ((org.joda.time.LocalDate) (obj));
    return org.apache.sqoop.connector.common.SqoopIDFUtils.encloseWithQuotes(org.apache.sqoop.connector.common.SqoopIDFUtils.df.print(date));
}
