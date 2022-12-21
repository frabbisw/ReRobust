private void setEndTime(java.lang.Double endTime) {
    try {
        this.endTime = (java.lang.Math.floor((endTime * 10))) / 10;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
