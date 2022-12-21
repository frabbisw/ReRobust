@java.lang.Override
public boolean hasNext() {
    try {
        if (((metricType) == null) || ((java.lang.Double.compare(((current) - (increment)), upLimit)) >= 0)) {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
