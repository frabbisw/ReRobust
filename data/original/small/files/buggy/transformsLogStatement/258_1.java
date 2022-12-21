public void setTimeSignature(int timeSignature) {
    System.out.println("log");
    this.timeSignature = timeSignature;
    barTime = timeSignature * 1000;
    displayTime = (barTime) * 4;
}
