public static com.pantor.blink.FixedDec._0 valueOf(java.lang.String s) {
    java.math.BigDecimal bd = new java.math.BigDecimal(s);
    try {
        bd.setScale(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new com.pantor.blink.FixedDec._0(bd.unscaledValue().longValue());
}
