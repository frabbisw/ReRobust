private void addSleeper(final long identifier, final org.apache.reef.util.ComplexCondition call) {
    synchronized (sleeperMap) {
        if (null != (sleeperMap.put(identifier, call))) {
            throw new java.lang.RuntimeException(java.lang.String.format("Duplicate identifier [%d] in sleeper map", identifier));
        }
    }
}
