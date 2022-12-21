private java.math.BigDecimal calculateLambda() throws java.lang.Exception {
    try {
        this.lambda = this.underlyingPrice.multiply(this.delta).divide(this.theoreticalValue, this.scale, java.math.RoundingMode.HALF_DOWN);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return scale(this.lambda);
}
