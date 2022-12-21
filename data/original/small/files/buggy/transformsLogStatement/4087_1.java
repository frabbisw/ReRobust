@java.lang.Override
public void evaluate(java.math.BigInteger value) {
    System.out.println("log");
    if (value != null) {
        long x = value.longValue();
        (count)++;
        sum += x;
        evaluateMinMax(x);
    }
}
