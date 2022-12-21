public void setStart(java.util.Date start) {
    try {
        this.start = new java.util.Date(start.getTime());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
