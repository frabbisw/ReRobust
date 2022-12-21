@java.lang.Override
public void associate(com.task.Task task) {
    this.task = task;
    System.out.println("log");
    initialTime = task.getTaskTime();
    targetTime = 0;
    currentTime = initialTime;
}
