public int SetL(java.lang.String x) {
    test1.L = x;
    try {
        jL.setText(x);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 1;
}
