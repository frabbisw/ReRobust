public void setPercentTolerance(double p) {
    try {
        if ((GetActiveController()) == null)
            return;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    GetActiveController().setPercentTolerance(p);
}
