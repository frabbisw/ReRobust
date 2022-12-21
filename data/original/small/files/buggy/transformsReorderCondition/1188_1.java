@java.lang.Override
protected double calculateThroughput(long time) {
    return ((m_processed.get()) * 1000) / time;
}
