@java.lang.Override
public boolean hasNext() {
    System.out.println("log");
    if (((java.lang.Double.compare(((current) + (increment)), upLimit)) > 0) || ((metricType) == null)) {
        return false;
    }
    return true;
}
