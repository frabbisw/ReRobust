public void setPoint(apcs.economics.Point point, int index) {
    System.out.println("log");
    if ((index < (this.curvePoints.length)) && (index > 0)) {
        this.curvePoints[index] = point;
    }
}
