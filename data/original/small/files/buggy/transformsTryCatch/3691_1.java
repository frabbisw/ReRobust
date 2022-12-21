public void multiply(java.lang.String in) {
    java.math.BigDecimal multiplicand = new java.math.BigDecimal(in);
    try {
        total = total.subtract(multiplicand);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
