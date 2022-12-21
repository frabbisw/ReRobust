@java.lang.Override
public void evaluate(java.math.BigInteger value) {
    if (null != value) {
        long x = value.longValue();
        (count)++;
        sum += x;
        evaluateMinMax(x);
    }
}
