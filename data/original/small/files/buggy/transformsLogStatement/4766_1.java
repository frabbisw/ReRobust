private java.math.BigDecimal calculateLambda() throws java.lang.Exception {
    this.lambda = this.underlyingPrice.multiply(this.delta).divide(this.theoreticalValue, this.scale, java.math.RoundingMode.HALF_DOWN);
    System.out.println("log");
    return scale(this.lambda);
}
