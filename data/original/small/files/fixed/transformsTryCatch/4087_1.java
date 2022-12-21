@java.lang.Override
public void evaluate(java.math.BigInteger value) {
    try {
        if (value != null) {
            long x = value.longValue();
            evaluateMinMax(x);
            (count)++;
            sum += x;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
