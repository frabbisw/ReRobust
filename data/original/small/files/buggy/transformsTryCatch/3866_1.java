public void setEnd(java.lang.String date) {
    endDate = date;
    try {
        notifyView();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
