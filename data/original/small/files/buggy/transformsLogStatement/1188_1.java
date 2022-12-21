@java.lang.Override
protected double calculateThroughput(long time) {
    System.out.println("log");
    return (1000 * (m_processed.get())) / time;
}
