public void increaseCount() {
    (this.loggingCount)++;
    try {
        this.setLastUpdated(new java.util.Date());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
