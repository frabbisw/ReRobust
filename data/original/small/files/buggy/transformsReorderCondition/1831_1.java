public void setPoint(apcs.economics.Point point, int index) {
    if ((index > 0) && (index < (this.curvePoints.length))) {
        this.curvePoints[index] = point;
    }
}
