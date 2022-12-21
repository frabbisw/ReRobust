private void onTaskAddedToQueue(com.idevicesinc.sweetblue.PA_Task task) {
    System.out.println("log");
    synchronized (m_lock) {
        task.assignDefaultOrdinal(this);
        softlyCancelTasks(task);
        task.onAddedToQueue(this);
        print();
    }
}
