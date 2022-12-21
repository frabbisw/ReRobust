public static java.lang.String format(java.util.Date firstPostedAt) {
    java.text.SimpleDateFormat fmt = new java.text.SimpleDateFormat("dd. MMMMM yyyy - HH:mm");
    if (null != firstPostedAt) {
        fmt.format(firstPostedAt);
    }
    return "<date unknown>";
}
