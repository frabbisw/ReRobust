public void actionPerformed(java.awt.event.ActionEvent evt) {
    System.out.println("log");
    clockTick = 0;
    clockTime = ((double) (clockTick)) / 10.0;
    timeString = new java.lang.Double(clockTime).toString();
    displayTime.setText(timeString);
}
