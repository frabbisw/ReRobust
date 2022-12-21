public static java.lang.String format(java.util.Date firstPostedAt) {
    java.text.SimpleDateFormat fmt = new java.text.SimpleDateFormat("dd. MMMMM yyyy - HH:mm");
    try {
        if (firstPostedAt != null) {
            fmt.format(firstPostedAt);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "<date unknown>";
}
