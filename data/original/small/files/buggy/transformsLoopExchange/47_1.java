private static java.math.BigInteger getFactorial(int n) {
    java.math.BigInteger fact = java.math.BigInteger.ONE;
    {
        int i = n;
        while (i > 1) {
            fact = fact.multiply(new java.math.BigInteger(java.lang.Integer.toString(i)));
            i--;
        }
    }
    return fact;
}
