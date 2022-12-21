private void onTaskAddedToQueue(com.idevicesinc.sweetblue.PA_Task task) {
    try {
        synchronized (m_lock) {
            task.assignDefaultOrdinal(this);
            softlyCancelTasks(task);
            task.onAddedToQueue(this);
            print();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
