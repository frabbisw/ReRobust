public static java.math.BigInteger getFactorial(int n) {
    java.math.BigInteger fact = java.math.BigInteger.ONE;
    try {
        for (int i = n; i > 1; i--) {
            fact = fact.multiply(new java.math.BigInteger(java.lang.Integer.toString(i)));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return fact;
}
