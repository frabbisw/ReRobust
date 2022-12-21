public int SetL(java.lang.String x) {
    try {
        if ((x.length()) == 1)
            x = "0" + x;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    test1.L = x;
    jL.setText(x);
    return 1;
}
