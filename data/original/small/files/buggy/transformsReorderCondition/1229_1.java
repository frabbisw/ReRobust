public long getLastTotalTimedExecutionTimeAndReset() {
    long retval = getTotalTimedExecutionTime();
    m_workerTask.m_lastTotalTimedExecutionTime = m_workerTask.m_totalTimedExecutionTime;
    if (null != (m_coordinatorTask)) {
        m_coordinatorTask.m_lastTotalTimedExecutionTime = m_coordinatorTask.m_totalTimedExecutionTime;
    }
    return retval;
}
