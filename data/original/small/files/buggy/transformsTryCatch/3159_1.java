public void setPercentTolerance(double p) {
    try {
        GetActiveController().setPercentTolerance(p);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
