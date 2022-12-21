@java.lang.Override
public boolean hasNext() {
    try {
        if (((java.lang.Double.compare(((current) + (increment)), upLimit)) > 0) || ((metricType) == null)) {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
