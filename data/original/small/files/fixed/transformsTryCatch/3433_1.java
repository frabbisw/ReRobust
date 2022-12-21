private void onTaskAddedToQueue(com.idevicesinc.sweetblue.PA_Task task) {
    try {
        synchronized (m_lock) {
            task.assignDefaultOrdinal(this);
            task.onAddedToQueue(this);
            softlyCancelTasks(task);
            print();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
