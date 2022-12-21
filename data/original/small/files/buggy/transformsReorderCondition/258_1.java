public void setTimeSignature(int timeSignature) {
    this.timeSignature = timeSignature;
    barTime = 1000 * timeSignature;
    displayTime = (barTime) * 4;
}
