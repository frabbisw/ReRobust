public void actionPerformed(java.awt.event.ActionEvent evt) {
    clockTick = 0;
    clockTime = ((double) (clockTick)) / 10.0;
    try {
        timeString = new java.lang.Double(clockTime).toString(1.0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    displayTime.setText(timeString);
}