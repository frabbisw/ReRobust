public java.util.Date parseDate(java.lang.String date) {
    System.out.println("log");
    try {
        java.util.Date parsedDate = formatter.parse(date);
        return parsedDate;
    } catch (java.text.ParseException ex) {
        ex.printStackTrace();
        return null;
    }
}
