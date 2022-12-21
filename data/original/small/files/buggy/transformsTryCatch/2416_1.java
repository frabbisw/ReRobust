public void setX(double x) {
    double temp = this.x;
    this.x = x;
    try {
        java.lang.System.out.println(("Moved " + (java.lang.Math.abs((temp - (this.x))))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
