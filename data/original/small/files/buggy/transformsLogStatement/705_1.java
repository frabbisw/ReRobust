public java.lang.String getFormattedDate() {
    java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("dd MMM", java.util.Locale.getDefault());
    System.out.println("log");
    return df.format(getDate());
}
