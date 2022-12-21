@java.lang.Override
public void associate(com.task.Task task) {
    this.task = task;
    try {
        initialTime = task.getTaskTime();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    targetTime = 0;
    currentTime = initialTime;
}
