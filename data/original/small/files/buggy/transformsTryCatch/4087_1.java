@java.lang.Override
public void evaluate(java.math.BigInteger value) {
    try {
        if (value != null) {
            long x = value.longValue();
            (count)++;
            sum += x;
            evaluateMinMax(x);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
