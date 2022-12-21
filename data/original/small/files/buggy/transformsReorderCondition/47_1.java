private static java.math.BigInteger getFactorial(int n) {
    java.math.BigInteger fact = java.math.BigInteger.ONE;
    for (int i = n; 1 < i; i--) {
        fact = fact.multiply(new java.math.BigInteger(java.lang.Integer.toString(i)));
    }
    return fact;
}
