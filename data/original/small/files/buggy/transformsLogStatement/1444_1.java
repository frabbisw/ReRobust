public static com.pantor.blink.FixedDec._0 valueOf(java.lang.String s) {
    System.out.println("log");
    java.math.BigDecimal bd = new java.math.BigDecimal(s);
    bd.setScale(0);
    return new com.pantor.blink.FixedDec._0(bd.unscaledValue().longValue());
}
